import java.util.Scanner;

public class SumAndAverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many numbers
        System.out.print("How many numbers? ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        // Read numbers into the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        // Compute average (use double for decimal)
        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}