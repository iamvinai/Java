import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
public class SetsDemo {

    // Enum for demonstrating EnumSet
    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        // HashSet Example
        Set<String> hashSet = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("HashSet:");
        iterateSet(hashSet);

        // LinkedHashSet Example
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("\nLinkedHashSet:");
        iterateSet(linkedHashSet);

        // TreeSet Example
        Set<String> treeSet = new TreeSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("\nTreeSet:");
        iterateSet(treeSet);

        // EnumSet Example
        Set<Days> enumSet = EnumSet.of(Days.MONDAY, Days.WEDNESDAY, Days.FRIDAY);
        System.out.println("\nEnumSet:");
        iterateSet(enumSet);

        // CopyOnWriteArraySet Example
        Set<String> cowSet = new CopyOnWriteArraySet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("\nCopyOnWriteArraySet:");
        iterateSet(cowSet);

        // Demonstrate various set operations
        demonstrateSetOperations(treeSet);
        demonstrateAdditionalSetMethods();
    }

    // Method to iterate over a Set and print elements
    private static <E> void iterateSet(Set<E> set) {
        for (E element : set) {
            System.out.println(element);
        }
    }

    // Method to demonstrate some basic Set operations
    private static void demonstrateSetOperations(Set<String> set) {
        System.out.println("\nBasic Set Operations:");
        System.out.println("Set contains 'Banana': " + set.contains("Banana"));
        set.remove("Banana");
        System.out.println("Set after removing 'Banana':");
        iterateSet(set);
        System.out.println("Set size: " + set.size());
        set.clear();
        System.out.println("Set after clearing: " + set.isEmpty());
    }

    // Method to demonstrate additional Set methods
    private static void demonstrateAdditionalSetMethods() {
        Set<String> set1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Banana", "Cherry", "Date", "Elderberry"));

        System.out.println("\nAdditional Set Methods:");

        // addAll() - Union of two sets
        set1.addAll(set2);
        System.out.println("After addAll(set2) (Union): " + set1);

        // retainAll() - Intersection of two sets
        set1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        set1.retainAll(set2);
        System.out.println("After retainAll(set2) (Intersection): " + set1);

        // removeAll() - Difference of two sets
        set1 = new HashSet<>(Arrays.asList("Apple", "Banana", "Cherry"));
        set1.removeAll(set2);
        System.out.println("After removeAll(set2) (Difference): " + set1);

        // containsAll() - Check if set1 contains all elements of set2
        boolean containsAll = set1.containsAll(set2);
        System.out.println("set1 contains all elements of set2: " + containsAll);
    }
}