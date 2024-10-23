import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // print the queue
        System.out.println("Queue: " + queue);

        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        String frontPoll1 = queue.poll();
        System.out.println("Removed element: " + frontPoll1);
        String frontPoll2 = queue.poll();
        System.out.println("Removed element: " + frontPoll2);

        // Throws exception if queue is empty
        String frontRemove = queue.remove();
        System.out.println("Removed element: " + frontRemove); 
        //Returns NULL if queue is empty
        String frontPoll = queue.poll();
        System.out.println("Removed element: " + frontPoll);

        // print the updated queue
        System.out.println("Queue after removal: " + queue);

        // add another element to the queue
        queue.add("date");

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // print the updated queue
        System.out.println("Queue after peek: " + queue);
    }
}
