import static java.lang.Math.*; // static import for Math methods

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) floorDiv(a, b); // uses Math.floorDiv()
    }

    public static void main(String[] args) {

        int x = 20;
        int y = 5;

        System.out.println("Addition: " + add(x, y));
        System.out.println("Subtraction: " + subtract(x, y));
        System.out.println("Multiplication: " + multiply(x, y));
        System.out.println("Division (floorDiv): " + divide(x, y));
    }
}