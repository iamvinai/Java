import java.util.Hashtable;
import java.util.Enumeration;

public class HashTableDemo {

    public static void main(String[] args) {
        // Creating a Hashtable instance with key and value both of type String
        Hashtable<String, String> htable = new Hashtable<String, String>();

        // Adding key-value pairs to the Hashtable
        htable.put("key1", "value1");
        htable.put("key2", "value2");
        htable.put("key3", "value3");

        // Accessing a value using a key
        String value = htable.get("key2");
        System.out.println("Value corresponding to key2: " + value);

        // Checking if a key exists in the Hashtable
        boolean keyExists = htable.containsKey("key3");
        System.out.println("Key 'key3' exists: " + keyExists);

        // Removing a key-value pair from the Hashtable
        htable.remove("key1");
        System.out.println("Key 'key1' removed.");

        // Iterating over the Hashtable using an Enumeration
        Enumeration<String> keys = htable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String val = htable.get(key);
            System.out.println("Key: " + key + ", Value: " + val);
        }

        // Additional methods specific to Hashtable
        htable.putIfAbsent("key4", "value4"); // Adds a key-value pair if the key is not already present
        htable.clear(); // Removes all key-value pairs from the Hashtable

        // Differences between Hashtable and HashMap:
        // 1. Synchronization: Hashtable is synchronized, while HashMap is not. This means Hashtable is thread-safe.
        // 2. Null values: Hashtable does not allow null keys or values, while HashMap allows one null key and multiple null values.
        // 3. Iteration: Hashtable is iterated using Enumeration, while HashMap uses Iterator.
        // 4. Performance: HashMap is generally faster than Hashtable as it is not synchronized.
    }
}