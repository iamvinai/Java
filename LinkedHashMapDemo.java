import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    private Map<Integer, String> linkedHashMap;

    public LinkedHashMapDemo() {
        linkedHashMap = new LinkedHashMap<>();
    }

    // Add a key-value pair to the LinkedHashMap
    public void addElement(int key, String value) {
        linkedHashMap.put(key, value);
        System.out.println("Added: (" + key + ", " + value + ")");
    }

    // Remove a key-value pair from the LinkedHashMap
    public void removeElement(int key) {
        if (linkedHashMap.containsKey(key)) {
            String removedValue = linkedHashMap.remove(key);
            System.out.println("Removed: (" + key + ", " + removedValue + ")");
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }

    // Get a value by key from the LinkedHashMap
    public String getElement(int key) {
        return linkedHashMap.get(key);
    }

    // Check if the LinkedHashMap contains a key
    public boolean containsKey(int key) {
        return linkedHashMap.containsKey(key);
    }

    // Check if the LinkedHashMap contains a value
    public boolean containsValue(String value) {
        return linkedHashMap.containsValue(value);
    }

    // Print all elements in the LinkedHashMap
    public void printAllElements() {
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        LinkedHashMapDemo sample = new LinkedHashMapDemo();

        // Adding elements
        sample.addElement(1, "One");
        sample.addElement(2, "Two");
        sample.addElement(3, "Three");

        // Printing all elements
        System.out.println("All elements:");
        sample.printAllElements();

        // Checking if a key exists
        System.out.println("Contains key 2: " + sample.containsKey(2));

        // Checking if a value exists
        System.out.println("Contains value 'Three': " + sample.containsValue("Three"));

        // Getting an element by key
        System.out.println("Element with key 3: " + sample.getElement(3));

        // Removing an element
        sample.removeElement(2);

        // Printing all elements after removal
        System.out.println("All elements after removal:");
        sample.printAllElements();
    }
}