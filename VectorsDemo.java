
import java.util.Vector;

public class VectorsDemo {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        vec.add(1);
        vec.add(2);
        vec.add(22);
        vec.add(12);
        vec.add(13);

        // Accessing elements using get method
        System.out.println("Element at index 2: " + vec.get(2));

        // Removing an element
        vec.remove(1); // Removes the element at index 1

        // Checking the size of the vector
        System.out.println("Size of the vector: " + vec.size());

        // Checking if a specific element is present in the vector
        System.out.println("Does the vector contain 12? " + vec.contains(12));
    }
}
    


