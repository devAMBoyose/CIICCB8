import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim(); // remove extra spaces at start/end

        if (sentence.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {
            // Split by one or more spaces
            String[] words = sentence.split("\\s+");
            System.out.println("Number of words: " + words.length);
        }
    }
}
