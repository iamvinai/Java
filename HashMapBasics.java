import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

    public static void main(String args[]){
        // Create a HashMap to store country-capital pairs
        HashMap<String, String> hmap = new HashMap<String, String>();
        
        // Add key-value pairs to the HashMap
        hmap.put("India", "New Delhi");
        hmap.put("USA", "Washington DC");
        hmap.put("Japan", "Tokyo");
        hmap.put("China", "Beijing");
        // Print all key-value pairs using entrySet
        System.out.println("------------------------------");
        System.out.println("Using entrySet:\n");
        for (Entry<String, String> temp : hmap.entrySet()) {
            System.out.println(temp.getKey() + " " + temp.getValue());
        }

        // Remove the entry for Japan
        hmap.remove("Japan");

        // Print all key-value pairs using an iterator over entrySet
        Iterator<Entry<String, String>> it = hmap.entrySet().iterator();
        System.out.println("------------------------------");
        System.out.println("Using iterator over entrySet:\n");
        while (it.hasNext()) {
            Entry<String, String> e = it.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // Print all key-value pairs using an iterator over keySet
        System.out.println("------------------------------");
        System.out.println("Using iterator over keySet:\n");
        Iterator<String> it1 = hmap.keySet().iterator();
        while (it1.hasNext()) {
            String key = it1.next();
            System.out.println(key + " " + hmap.get(key));
        }
    }
}