import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        char ch = input.next().charAt(0); // get one character

        // Convert to lowercase for easy checking
        ch = Character.toLowerCase(ch);

        // Check if alphabet
        if (ch < 'a' || ch > 'z') {
            System.out.println("Invalid input. Please enter a letter.");
        } else {
            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        }
    }
}
