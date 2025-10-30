class TaskSheet1_1_3 {

    public static void main(String[] args) {

        int check_number = 10; // loop
        String message; // container message

        // loop from 1 to int check_number
        for (int i = 1; i <= check_number; i++) {

            // if even or odd conditional
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";

            // print
            System.out.println(message);
        }
    }
}
