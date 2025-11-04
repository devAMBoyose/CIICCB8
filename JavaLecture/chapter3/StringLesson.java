package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        String str4 = "Java Programming";
        System.out.println("Length of str4: " + str4.length());
        System.out.println("Character at index 5: " + str4.charAt(5));
        System.out.println("Substring from index 5 to 16: " + str4.substring(5, 16));
        System.out.println("Index of 'Programming': " + str4.indexOf("Programming"));
        System.out.println("Replace 'Java' with 'Python': " + str4.replace("Java", "Python"));
        System.out.println("Uppercase: " + str4.toUpperCase());
        System.out.println("Lowercase: " + str4.toLowerCase());
        System.out.println("Trimmed string: '" + "   Hello World   ".trim() + "'");

        String str5 = "apple,banana,cherry";
        String[] fruits = str5.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}