import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayLists {
    public static void main(String args[]) {
        // Initialize two ArrayLists with integers
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 4, 5, 6, 7));
        ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        
        // Sort both ArrayLists
        Collections.sort(arr1);
        Collections.sort(arr2);
        
        // Compare the sorted ArrayLists and print the result
        System.out.println(arr1.equals(arr2)); // Output: true
        
        // Initialize two ArrayLists with strings
        ArrayList<String> arrS1 = new ArrayList<String>(Arrays.asList("Vinai", "Virat", "Dhoni"));
        ArrayList<String> arrS2 = new ArrayList<String>(Arrays.asList("Vinai", "Virat", "Dhoni", "Anushka"));
        
        // Remove all elements in arrS1 from arrS2
        arrS2.removeAll(arrS1);
        
        // Print the remaining elements in arrS2
        System.out.println(arrS2); // Output: [Anushka]
        
        // Initialize two more ArrayLists with strings
        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("C++", "Python", "Java", "Ruby"));
        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("C++", "Java", "Python", "Rust"));
        
        // Retain only the elements in lang1 that are also in lang2
        lang1.retainAll(lang2);
        lang2.forEach(name -> {System.out.println(name);});
        
        // Print the common elements
        System.out.println(lang1); // Output: [C++, Python, Java]
    }
}