import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDemoInbuilt {
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Vinai");
        ll.add("Virat");

        System.out.println(ll.size());

        System.out.println(ll.get(1));

        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ll.add(2,"Anushka");
        ll.add(3,"dhnoni");

        System.out.println(ll);

        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.addAll(ll);
        ll1.addFirst("King");
        ll1.addLast("Kohli");
        ll1.remove(1);
        Collections.sort(ll1);
        System.out.println(ll1);
        ll1.removeAll(ll);
        System.out.println(ll1);
        ll1.removeFirst();
        ll1.removeLast();
        ll1.add("Vinai");
        System.out.println(ll1);


    }

}
