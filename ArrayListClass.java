import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String []args){
        ArrayList<Object> arr = new ArrayList<Object>();
        arr.add(10);
        arr.add("Hello");
        arr.add(10.10);
        // System.out.println(arr.get(0));
        // System.out.println(arr.get(1));
        ArrayList<Integer>arr2 = new ArrayList<Integer>();
        arr2.add(10);
        //System.out.println(arr2.size());
        Iterator<Integer> it = arr2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
}
