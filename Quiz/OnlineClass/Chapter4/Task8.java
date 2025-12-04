public class Task8 {

    // method with variable arguments
    public static int sumAll(int... nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    // method to print cumulative sum for each number
    public static void printCumulative(int... nums) {
        for (int n : nums) {
            int sum = 0;
            System.out.print(n + " = ");

            for (int i = 1; i <= n; i++) {
                sum += i;
                System.out.print(i);
                if (i < n) {
                    System.out.print("+");
                }
            }

            System.out.println(" (" + sum + ")");
        }
    }

    public static void main(String[] args) {
        int total = sumAll(4, 5, 10);

        System.out.println("Total Sum of Parameters = " + total);
        System.out.println();

        printCumulative(4, 5, 10);
    }
}