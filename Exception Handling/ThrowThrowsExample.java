import java.util.Scanner;

public class ThrowThrowsExample {

    // Method that declares the exception using 'throws'
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // Actively throwing an exception using 'throw'
            throw new IllegalArgumentException("Age must be 18 or older to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Call the method that can throw an exception
            checkAge(age);

        } catch (IllegalArgumentException e) {
            // Catch the exception thrown by 'throw'
            System.err.println("Exception caught: " + e.getMessage());

        } finally {
            System.out.println("Program ended.");
            scanner.close();
        }
    }
}
