package wk4;

import java.util.*;
public class VectorExample2 {
public static void main(String[] args) {
// Create a Vector with an initial capacity of 3
Vector<Integer> vector = new Vector<>(3);
// Add elements to the Vector
vector.add(10);
vector.add(20);
vector.add(30);
vector.add(40); // This will cause the Vector to resize
// Display the Vector
System.out.println("Vector: " + vector);
// Check the current capacity
System.out.println("Capacity of Vector: " + vector.capacity());
}
}