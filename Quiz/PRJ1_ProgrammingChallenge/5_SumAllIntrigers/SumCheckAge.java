import java.util.Scanner;

public class SumCheckAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Enter integers (type 0 to stop):");

        do {
            number = input.nextInt();
            sum = sum + number;
        } while (number != 0);

        System.out.println("Total sum = " + sum);

        if (sum == 35) {
            System.out.println("My age: 35");
        } else {
            System.out.println("Sum is not my age.");
        }
    }
}
