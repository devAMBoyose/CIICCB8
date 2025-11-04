import java.util.Scanner;

//using library
public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input names
        System.out.print("Enter first name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter third name: ");
        String name3 = sc.nextLine();

        // Input numbers
        System.out.print("Enter " + name1 + "'s number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter " + name2 + "'s number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter " + name3 + "'s number: ");
        int num3 = sc.nextInt();

        // Check all equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        }
        // Compare who has the largest number
        else if (num1 > num2 && num1 > num3) {
            System.out.println(name1 + " has the largest number: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(name2 + " has the largest number: " + num2);
        } else {
            System.out.println(name3 + " has the largest number: " + num3);
        }

        sc.close();
    }
}
