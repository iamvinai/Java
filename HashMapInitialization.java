import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapInitialization {

    // Initializing a mutable HashMap using a static block
    public static HashMap<String, Integer> marksMap;

    static {
        marksMap = new HashMap<String, Integer>();
        marksMap.put("A", 100);
        marksMap.put("B", 200);
    }

    public static void main(String args[]) {

        // Initializing a mutable HashMap
        Map<String, String> hmap1 = new HashMap<String, String>();

        // Accessing an element from the mutable HashMap
        System.out.println(HashMapInitialization.marksMap.get("A"));

        // Initializing an immutable map with a single entry
        Map<String, Integer> hmap3 = Collections.singletonMap("A", 100);
        System.out.println(hmap3.get("A"));
        // hmap3.put("B", 200); // Unsupported Operation Exception

        // Initializing an empty immutable map
        hmap1 = Map.of();
        // hmap1.put("Vinai", "Hi"); // Unsupported Operation Exception

        // Initializing an immutable map with multiple entries
        hmap1 = Map.of("Vinai", "18", "Abdevilliers", "17"); //max limit of 10 values
        System.out.println(hmap1);
        // hmap1.put("Dhoni", "7"); // Unsupported Operation Exception

        // Initializing an immutable map using Map.ofEntries
        hmap1 = Map.ofEntries(
            new AbstractMap.SimpleEntry<String, String>("Vinai", "18"),
            new AbstractMap.SimpleEntry<String, String>("Abdevilliers", "17")
        );
        System.out.println(hmap1);
    }
}