public class Task3 {
    public static void main(String[] args) {

        // (Strings)
        String a = "Anna"; 
        String b = a; 
        String c = "Boyose"; 
        String d = new String("Anna") + "!"; 

        // (Booleans)
        boolean b1 = (a == b); 
        boolean b2 = d.equals(b + "!"); 
        boolean b3 = !c.equals(a); 

        // (Condition)
        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
