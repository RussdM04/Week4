package wk4;

import java.util.*;
public class VectorSearchExample {
public static void main(String[] args) {
// Create a Vector to store integers
Vector<Integer> vector = new Vector<>(Arrays.asList(10, 20, 30, 40, 50));
// Initializing with some numbers
Scanner scanner = new Scanner(System.in);
// Print the current list of integers in the Vector
System.out.println("Current list in the Vector: " + vector);
// Allow the user to search for a number in the Vector
System.out.print("Enter a number to search in the Vector: ");
int searchNumber = scanner.nextInt();
if (vector.contains(searchNumber)) {
System.out.println("The number " + searchNumber + " is present in the Vector.");
} else {
System.out.println("The number " + searchNumber + " is not present in the Vector.");
}
scanner.close();
}
}
