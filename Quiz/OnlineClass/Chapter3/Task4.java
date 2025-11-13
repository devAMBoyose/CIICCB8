import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Put something here
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        // Reverse the word using StringBuilder
        String reversed = new StringBuilder(word).reverse().toString();

        // Check print palindrome or not
        if (word.equals(reversed)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
