public class Task6 {
    public static void main(String[] args) {

        int[] numbers = {
                951, 402, 984, 651, 360, 69, 408, 319, 601, 485, 980, 507, 725, 547, 544,
                615, 83, 165, 141, 501, 263, 617, 865, 575, 719, 309, 984, 592, 236, 105,
                942, 941, 386, 462, 47, 418, 907, 234, 326, 375, 323, 566, 597, 978, 237,
                328, 615, 953, 345, 399, 162, 758, 219, 918, 237, 412, 566, 682, 248, 868,
                950, 626, 949, 687, 217, 815, 67, 104, 58, 512, 24, 892, 894, 767, 553,
                81, 379, 843, 831, 445, 742, 717, 958, 609, 842, 45, 688, 753, 584, 685,
                93, 887, 440, 380, 126, 721, 328, 753, 470, 743, 527
        };

        int count = 0; // counts how many numbers printed in the row

        for (int num : numbers) {

            if (num == 237) {
                break; // stop when hitting 237
            }

            if (num % 2 == 0) { // even numbers only
                System.out.print(num + "\t"); // print with tab
                count++;

                if (count == 4) { // when 4 numbers printed new line
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
