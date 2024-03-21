import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take user input for x and y
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();
        try {
            int result = computeDivision(x, y);
            System.out.println("Result of x/y: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: " +
e.getMessage());
        }
        // Validate age input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            validate(age);
        } catch (ArithmeticException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
        scanner.close();
    }
    public static int computeDivision(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return x / y;
    }
    public static void validate(int age) {
        if (age &lt; 18) {
            throw new ArithmeticException("You are not eligible to vote");

        } else {
            System.out.println("Welcome to vote");
        }
    }
}