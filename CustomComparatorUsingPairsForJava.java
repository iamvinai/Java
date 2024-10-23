import java.util.*;

public class CustomComparatorUsingPairsForJava {

    public static void main(String[] args) {

        // Initialize a HashMap with some sample data
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);
        map.put("Date", 2);
        map.put("Elderberry", 3);

        // Convert the map's entry set into a List of Map.Entry
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        //entryList.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
        // Create a comparator to sort by value first, then by key
        Comparator<Map.Entry<String, Integer>> valueThenKeyComparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                // Compare by value first
                int valueComparison = Integer.compare(e1.getValue(), e2.getValue());
                // If values are equal, compare by key
                if (valueComparison == 0) {
                    return e1.getKey().compareTo(e2.getKey());
                }
                return valueComparison;
            }
        };

        // Sort the list of entries using the combined comparator
        Collections.sort(entryList, valueThenKeyComparator);
        //entryList.sort(valueThenKeyComparator);

        // Create a LinkedHashMap to maintain the sorted order
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // Output the sorted map
        System.out.println("Sorted Map:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Create a list of AbstractMap.SimpleEntry pairs 
        // This is a parallel for using pairs in C++ and then sorting them using custom compararator.
        List<Map.Entry<String, Integer>> pairList = new ArrayList<>();
        pairList.add(new AbstractMap.SimpleEntry<>("Apple", 3));
        pairList.add(new AbstractMap.SimpleEntry<>("Banana", 2));
        pairList.add(new AbstractMap.SimpleEntry<>("Cherry", 5));
        pairList.add(new AbstractMap.SimpleEntry<>("Date", 2));
        pairList.add(new AbstractMap.SimpleEntry<>("Elderberry", 3));

        // Define a custom comparator to sort pairs by value, then by key
        Comparator<Map.Entry<String, Integer>> customComparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                // Compare by value first
                int valueComparison = Integer.compare(e1.getValue(), e2.getValue());
                // If values are equal, compare by key
                if (valueComparison == 0) {
                    return e1.getKey().compareTo(e2.getKey());
                }
                return valueComparison;
            }
        };

        // Sort the list using the custom comparator
        pairList.sort(customComparator);

        // Output the sorted list
        System.out.println("Sorted Pairs:");
        for (Map.Entry<String, Integer> entry : pairList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}