import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // 1. Length of the string
        System.out.println("Length of string: " + str.length());

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. First character
        if (str.length() > 0) {
            System.out.println("First character: " + str.charAt(0));
        }

        // 5. Last character
        if (str.length() > 0) {
            System.out.println("Last character: " + str.charAt(str.length() - 1));
        }

        // 6. Substring from 2nd to 5th character (index 1 to index 4)
        if (str.length() >= 5) {
            System.out.println("Substring (2nd to 5th char): " + str.substring(1, 5));
        } else {
            System.out.println("String is too short for substring 2–5.");
        }
    }
}