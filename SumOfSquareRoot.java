import java.util.Scanner;

public class SumOfSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Conditional logic: check the value of number.
        if (number > 0) {
            // This condition runs only when the number is greater than zero.
            System.out.println("The number is positive.");
        } else if (number < 0) {
            // This condition runs only when the number is less than zero.
            System.out.println("The number is negative.");
        } else {
            // This condition runs when neither of the above is true.
            System.out.println("The number is zero.");
        }

        // Another example of conditional logic.
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            // If the age is 18 or greater, the person is considered an adult.
            System.out.println("You are eligible to vote.");
        } else {
            // Otherwise, they are under 18.
            System.out.println("You are not eligible to vote yet.");
        }

        sc.close();
    }
}

// Explanation:
// - if checks the first condition.
// - else if checks another condition only if the first one is false.
// - else runs when all previous conditions are false.
// - Conditions are written using comparison operators such as >, <, >=, <=, and ==.
