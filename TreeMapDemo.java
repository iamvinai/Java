import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String args[]){
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(13000,"Vinai");
        treeMap.put(20000,"Virat");
        treeMap.put(11000,"Dhoni");
        treeMap.put(12000,"Anushka");
        System.out.println("--------------------------------");
        System.out.println(treeMap);

        treeMap.forEach((k,v)->System.out.println(k+" "+v));
        System.out.println("--------------------------------");
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        Set<Integer> keysLessThan12000 = treeMap.headMap(12000).keySet();
        System.out.println(keysLessThan12000);
        Set<Integer> keysGreaterThan12000 = treeMap.tailMap(12000).keySet();
        System.out.println(keysGreaterThan12000);
         TreeMap<Integer,String> treeMap1 = new TreeMap<>(Comparator.reverseOrder());
        treeMap1.put(13000,"Vinai");
        treeMap1.put(20000,"Virat");
        treeMap1.put(15000,"Dhoni");
        treeMap1.put(12000,"Anushka");
        System.out.println(treeMap1);
    }

}
