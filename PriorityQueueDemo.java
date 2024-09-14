import java.util.PriorityQueue;
import java.util.Comparator;

// Custom class to hold data
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Using built-in PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(15);
        pq.add(20);
        pq.add(1);

        // Print the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Remove and return the head of the PriorityQueue
        System.out.println("poll(): " + pq.poll());

        // Print the PriorityQueue after poll()
        System.out.println("PriorityQueue after poll(): " + pq);

        // Remove the specified element from the PriorityQueue
        pq.remove(5);

        // Print the PriorityQueue after remove()
        System.out.println("PriorityQueue after remove(): " + pq);

        // Return the head of the PriorityQueue without removing it
        System.out.println("peek(): " + pq.peek());

        // Print the PriorityQueue after peek()
        System.out.println("PriorityQueue after peek(): " + pq);

        // Return the head of the PriorityQueue without removing it
        System.out.println("element(): " + pq.element());

        // Print the PriorityQueue after element()
        System.out.println("PriorityQueue after element(): " + pq);

        // Return the size of the PriorityQueue
        System.out.println("size(): " + pq.size());

        // Check if the PriorityQueue is empty
        System.out.println("isEmpty(): " + pq.isEmpty());

        // Clear the PriorityQueue
        pq.clear();

        // Print the PriorityQueue after clear()
        System.out.println("PriorityQueue after clear(): " + pq);

        // Check if the PriorityQueue is empty after clear()
        System.out.println("isEmpty() after clear(): " + pq.isEmpty());

        // Using custom PriorityQueue with Comparator
        PriorityQueue<Person> customPq = new PriorityQueue<>(new PersonComparator());
        customPq.add(new Person("John", 25));
        customPq.add(new Person("Alice", 30));
        customPq.add(new Person("Bob", 20));
        System.out.println("Custom PriorityQueue:");
        while (!customPq.isEmpty()) {
            System.out.println(customPq.poll());
        }
    }
}

// Custom Comparator for Person class
class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.age - p2.age; // Sort by age in ascending order
    }
}