import java.util.HashMap;
import java.util.Hashtable;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapComparison {

    public static void main(String[] args) {
        // HashMap example
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        System.out.println("HashMap: " + hashMap);
        // HashMap is not synchronized and is not thread-safe

        // Hashtable example
        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");
        System.out.println("Hashtable: " + hashtable);
        // Hashtable is synchronized and thread-safe but generally slower

        // SynchronizedMap example
        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        synchronizedMap.put("key1", "value1");
        synchronizedMap.put("key2", "value2");
        System.out.println("SynchronizedMap: " + synchronizedMap);
        // SynchronizedMap is a synchronized wrapper around a HashMap

        // Demonstrating ConcurrentModificationException
        try {
            // Synchronize on the synchronized map to ensure thread safety during iteration
            synchronized (synchronizedMap) {
                for (Map.Entry<String, String> entry : synchronizedMap.entrySet()) {
                    if ("key1".equals(entry.getKey())) {
                        synchronizedMap.put("key3", "value3"); // This will cause ConcurrentModificationException
                    }
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException caught: " + e);
        }
        
        // ConcurrentHashMap example
        Map<String, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("key1", "value1");
        concurrentMap.put("key2", "value2");
        System.out.println("ConcurrentHashMap: " + concurrentMap);
        // ConcurrentHashMap is designed for concurrent access and is thread-safe

        // Demonstrating ConcurrentModificationException
        try {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                if ("key1".equals(entry.getKey())) {
                    hashMap.put("key3", "value3"); // This will cause ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException caught: " + e);
        }

        // Demonstrating differences in thread safety
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                hashMap.put("key" + i, "value" + i);
                hashtable.put("key" + i, "value" + i);
                synchronizedMap.put("key" + i, "value" + i);
                concurrentMap.put("key" + i, "value" + i);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("HashMap size: " + hashMap.size());
        System.out.println("Hashtable size: " + hashtable.size());
        System.out.println("SynchronizedMap size: " + synchronizedMap.size());
        System.out.println("ConcurrentHashMap size: " + concurrentMap.size());
    }
}