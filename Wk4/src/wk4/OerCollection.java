package wk4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class OerCollection {
    public static void main(String[] args) {
        //1. Creating a TreeSet to store integers
        Set<Integer> numbers = new TreeSet<>();
        
        numbers.add(10);       
        System.out.println("Numbers Set (Sorted): " + numbers);

        //2. Creating an ArrayList to store colors
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        
        System.out.println("Colors List: " + colors);

        //3. Creating a LinkedList to store fruits
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        System.out.println("Fruits List: " + fruits); 

        //3. Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        
        queue.add("First");
        queue.add("Second");
        
        //4. Printing the queue
        System.out.println("Queue: " + queue);
        
        //5. Removing the front element (FIFO order)
        String removed = queue.poll();
        System.out.println("Removed from queue: " + removed);

        //6. Creating a HashMap to store fruits and their quantities
        Map<String, Integer> map = new HashMap<>();
        
        // Adding key-value pairs to the map
        map.put("Apple", 3);        
        // Printing the map (key-value pairs)
        System.out.println("Map: " + map);
        
        // Accessing a value using the key
        int quantity = map.get("Apple");
        System.out.println("Apple quantity: " + quantity); // Output: 3
    }
}
