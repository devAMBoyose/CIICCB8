import java.util.Scanner;

public class StringBuilderActivity {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string with at least 10 characters: ");
        StringBuilder sb = new StringBuilder(input.nextLine());

        // 1. Print length
        System.out.println("1. Length: " + sb.length());

        // 2. Print first character
        System.out.println("2. First character: " + sb.charAt(0));

        // 3. Print last character
        System.out.println("3. Last character: " + sb.charAt(sb.length() - 1));

        // 4. Index of first occurrence of 'a'
        System.out.println("4. Index of 'a': " + sb.indexOf("a"));

        // 5. Substring from index 3 to 6
        System.out.println("5. Substring (index 3 to 6): " + sb.substring(3, 6));

        // 6. Append "123" to end
        sb.append("123");
        System.out.println("6. After append \"123\": " + sb);

        // 7. Insert "xyz" at index 4
        sb.insert(4, "xyz");
        System.out.println("7. After insert \"xyz\" at index 4: " + sb);

        // 8. Delete substring from index 2 to 4
        sb.delete(2, 4);
        System.out.println("8. After delete (index 2 to 4): " + sb);

        // 9. Delete character at index 8
        if (sb.length() > 8) {
            sb.deleteCharAt(8);
        }
        System.out.println("9. After deleteCharAt(8): " + sb);

        // 10. Reverse the string
        sb.reverse();
        System.out.println("10. Reversed: " + sb);
    }
}