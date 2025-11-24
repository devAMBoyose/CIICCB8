public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { // rows
            for (int j = 1; j <= 10; j++) { // columns
                System.out.print((i * j) + "\t"); // tab space for alignment
            }
            System.out.println(); // next line
        }
    }
}
