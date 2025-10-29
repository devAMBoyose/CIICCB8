public class Task3 {
    public static void main(String[] args) {

        // (Strings)
        String a = "Wow";      
        String b = a;
        String c = "Hello";
        String d = "Wowr";

        // conditions
        boolean b1 = (a == b);             
        boolean b2 = d.equals(b + "r");
        boolean b3 = !c.equals(a);

        // if true print "Success!"
        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
