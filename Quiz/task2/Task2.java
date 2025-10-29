public class Task2 {
    public static void main(String[] args) {

        // primitive types
        byte zero = 0;
        short one = 1;
        float f = 2.0f;
        char H = 'H';
        char w = 'w';
        char r = 'r';
        char d = 'd';
        boolean isTrue = true;

        // concatenate them into a string
        String output = H + "" + (one + 2) + one + one + zero + " " + w + zero + r + one + d + " " + f + " " + isTrue;

        // final output
        System.out.println(output);
    }
}
