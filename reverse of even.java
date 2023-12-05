import java.util.Scanner;

public class ReverseEvenNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even
        if (number % 2 == 0) {
            // Display the reverse of the even number
            int reversedNumber = reverseNumber(number);
            System.out.println("Reverse of the even number is: " + reversedNumber);
        } else {
            // If the number is odd, don't display anything
            System.out.println("Entered number is odd. Not displaying reverse.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Function to reverse a number
    private static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}
