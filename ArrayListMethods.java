import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
    @SuppressWarnings("unchecked")
    public static void main(String []args){
        // Section 1: ArrayList with mixed types
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add(10);
        arr.add("Hello");
        arr.add(10.10);
        // Section 2: ArrayList with integers
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(10);
        arr2.add(20);
        
        // Add all elements of arr2 to arr
        arr.addAll(arr2);
        System.out.println(arr);
        
        // Section 3: Cloning and modifying ArrayList
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        if(arr2.size() > 0)
            arr3 = (ArrayList<Integer>) arr2.clone();
        arr3.set(1, 100);
        System.out.println(arr3.contains(100));
        
        // Section 4: ArrayList of strings with operations
        ArrayList<String> arrS = new ArrayList<String>(Arrays.asList("Hi", "Hello"));
        System.out.println(arrS.lastIndexOf("Hi"));
        arrS.remove("Hello");
        
        // Section 5: Removing elements greater than 5 and also removing a particular Integer rather than based on indexing
        ArrayList<Integer> arr4 = new ArrayList<Integer>(Arrays.asList(1, 20, 3, 4, 
                                    5, 6, 7, 8, 9));
        arr4.removeIf(num -> num > 8);
        Integer i=20;
        arr4.remove(i);
        System.out.println("Arr4: "+arr4);
        
        // Section 6: Retaining specific elements
        ArrayList<String> arrS2 = new ArrayList<String>(Arrays.asList("Naveen", "Naveen",
                                 "Praveen", "Virat", "Dhoni", "Anushka"));
        arrS2.retainAll(Collections.singleton("Naveen"));
        System.out.println("arrS2: "+arrS2);
        
        // Section 7: Creating and printing sublist
        ArrayList<String> subList = new ArrayList<String>(arrS2.subList(0, arrS2.size()));
        System.out.println(subList.size());

        ArrayList<String> convertToArray = new ArrayList<String>(Arrays.asList("Naveen", 
                                    "Naveen", "Praveen", "Virat", "Dhoni", "Anushka"));
        Object[] convertedArray = convertToArray.toArray();
        System.out.println(convertedArray.toString());
        for(Object obj:convertToArray){
            System.out.println((String)obj);
        }


    }
}