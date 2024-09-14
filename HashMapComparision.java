import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map;
public class HashMapComparision {
    public static void main(String args[]) {

        // Initialize and populate HashMaps
        Map<String, String> hmap1 = new HashMap<String, String>();
        hmap1.put("India", "New Delhi");
        hmap1.put("USA", "Washington DC");
        hmap1.put("Japan", "Tokyo");
        hmap1.put("China", "Beijing");
        
        HashMap<String, String> hmap2 = new HashMap<String, String>();
        hmap2.put("India", "New Delhi");
        hmap2.put("Japan", "Tokyo");
        hmap2.put("Japan New", "Tokyo");
        hmap2.put("USA", "Washington DC");

        HashMap<String, String> hmap3 = new HashMap<String, String>();
        hmap3.put("India", "New Delhi");
        hmap3.put("Japan", "Tokyo");
        hmap3.put("USA", "Washington DC");
        hmap3.put("China", "Beijing");

        // Compare HashMaps
        System.out.println(hmap1.equals(hmap2)); // Compare hmap1 and hmap2
        System.out.println(hmap2.equals(hmap3)); // Compare hmap2 and hmap3

        // Compare key sets of HashMaps
        System.out.println(hmap1.keySet().equals(hmap2.keySet())); // Compare keys of hmap1 and hmap2
        System.out.println(hmap2.keySet().equals(hmap3.keySet())); // Compare keys of hmap2 and hmap3

        // Union and difference of key sets
        HashSet<String> hset = new HashSet<String>(hmap1.keySet());
        hset.addAll(hmap3.keySet()); // Union of keys from hmap1 and hmap3
        System.out.println(hset);
        hset.removeAll(hmap1.keySet()); // Difference of keys from hmap1 and hmap3
        System.out.println(hset);

        // Compare values of HashMaps - duplicates values are not allowed 
        ArrayList<String> arr1 = new ArrayList<String>(hmap1.values());
        ArrayList<String> arr2 = new ArrayList<String>(hmap3.values());
        ArrayList<String> arr3 = new ArrayList<String>(hmap2.values());
        System.out.println(arr1+" "+arr2+" "+arr1.equals(arr2)); // Compare values of hmap1 and hmap3
        System.out.println(arr1+" "+arr2+" "+arr1.equals(arr3)); // Compare values of hmap1 and hmap2

        // Compare values of HashMaps - duplicates values are allowed 
        HashSet<String> hset1 = new HashSet<String>(hmap1.values());
        HashSet<String> hset2 = new HashSet<String>(hmap3.values());
        HashSet<String> hset3 = new HashSet<String>(hmap2.values());
        System.out.println(hset1.equals(hset2)); // Compare values of hmap1 and hmap3
        System.out.println(hset1.equals(hset3)); // Compare values of hmap1 and hmap2
    }
}