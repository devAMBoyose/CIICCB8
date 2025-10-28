// public class Task2 {
//     public static void main(String[] args) {

//         byte zero = 0;
//         short one = 1;
//         int two = 2;
//         float fnum = 2.0f;
//         char H = 'H';
//         char w = 'w';
//         char r = 'r';
//         char d = 'd';
//         boolean isTrue = true;

//             String part1 = H + "" + (one + 2) + one + zero;   // H3110
//             String part2 = " " + w + zero + r + one + d;      //  w0r1d
//             String part3 = " " + fnum + " " + isTrue;         //  2.0 true

//         // combine everything
//         System.out.println(part1 + part2 + part3);
//     }
// }


public class Task2 {
    public static void main(String[] args) {

        // all primitive types
        byte zero = 0;
        short one = 1;
        float f = 2.0f;
        char H = 'H';
        char w = 'w';
        char r = 'r';
        char d = 'd';
        boolean isTrue = true;

            String output = H + "" + (one + 2) + one + one + zero + " " + w + zero + r + one + d + " " + f + " " + isTrue;

        // final output
        System.out.println(output);
    }
}




