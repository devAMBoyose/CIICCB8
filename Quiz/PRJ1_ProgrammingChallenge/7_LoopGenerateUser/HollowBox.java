import java.util.Scanner;

public class HollowBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the box: ");
        int n = input.nextInt();

        // Loop for rows
        for (int i = 1; i <= n; i++) {

            // Loop for columns
            for (int j = 1; j <= n; j++) {

                // First row, last row, first column, last column = *
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // hollow space
                }
            }

            System.out.println(); // move to next line
        }
    }
}
