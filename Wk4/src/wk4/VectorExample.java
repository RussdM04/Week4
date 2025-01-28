package wk4;

import java.util.*;
public class VectorExample {
public static void main(String[] args) {
// Create a Vector of String
Vector<String> vector = new Vector<>();
// Adding elements
vector.add("Apple");
vector.add("Banana");
vector.add("Orange");
// Insert an element at a specific position
vector.add(1, "Mango");
// Display Vector
System.out.println("Vector after insertion: " + vector);
// Get an element by index
System.out.println("Element at index 2: " + vector.get(2));
// Set a new value at index 0
vector.set(0, "Pineapple");
// Remove an element
vector.remove(2); // Removes "Orange"
System.out.println("Vector after removal: " + vector);
// Size of the Vector
System.out.println("Size of the vector: " + vector.size());
// Clear the vector
vector.clear();
System.out.println("Vector after clearing: " + vector);
}
}
