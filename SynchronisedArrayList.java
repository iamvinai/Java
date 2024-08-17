import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisedArrayList {
    public static void main(String[]args){
        List<String> syncList = Collections.synchronizedList(new ArrayList<String>());
        syncList.add("Praveen");
        syncList.add("Virat");
        syncList.add("Dhoni");

        // Add and remove operations are synced implicitly
        // fetching elements should be synced explicitly
        synchronized(syncList){
            Iterator<String> it = syncList.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }

        // Use can also use thread safe arraylist which is copyOnWriteArrayList
        // In this all the operations are synchronized by default 
        // no need of explicit synchronization
        CopyOnWriteArrayList<String> synchronisedArrayList = new CopyOnWriteArrayList<String>();
        synchronisedArrayList.add("Anushka");
        synchronisedArrayList.add("Sakshi");
        synchronisedArrayList.add("Pooja");

        Iterator<String> it = synchronisedArrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
