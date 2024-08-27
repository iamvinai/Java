import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;

public class HashMapToArrayList {

    public static void main(String[] args) {
        // Create a sample HashMap
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("One", 1);
        sampleMap.put("Two", 2);
        sampleMap.put("Three", 3);
        Iterator<Map.Entry<String,Integer>> it = sampleMap.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> pair = (Map.Entry<String,Integer>)it.next();
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

        // Convert HashMap keys to ArrayList
        ArrayList<String> keysList = new ArrayList<>(sampleMap.keySet());

        // Convert HashMap values to ArrayList
        ArrayList<Integer> valuesList = new ArrayList<>(sampleMap.values());

        // Print the ArrayLists
        System.out.println("Keys ArrayList: " + keysList);
        System.out.println("Values ArrayList: " + valuesList);
    }
}