package wk4;

import java.util.*;
public class VectorInputExample {
public static void main(String[] args) {
// Create a Vector to store integers
Vector<Integer> vector = new Vector<>();
Scanner scanner = new Scanner(System.in);
// Read a series of integers entered by the user into a Vector
System.out.println("Enter integers (type 'done' to stop):");
while (true) {
String input = scanner.nextLine();
if (input.equalsIgnoreCase("done")) {
break;
}
try {
// Parse the input as an integer
int number = Integer.parseInt(input);
vector.add(number);
} catch (NumberFormatException e) {
System.out.println("Invalid input, please enter an integer or 'done' to stop.");
}
}
// Print the list of integers in the Vector
System.out.println("List of integers in the Vector: " + vector);
scanner.close();
}
}