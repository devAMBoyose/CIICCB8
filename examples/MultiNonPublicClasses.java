// File: MainProgram.java
//A .java file can contain more than one class, but only one class can be public.
//The other classes are “package-private” (accessible only within the same package).

public class MainProgram {
    public static void main(String[] args) {
        Helper.greet();
    }
}

class Helper {
    static void greet() {
        System.out.println("Hello from Helper class!");
    }
}

/*MainProgram is public → filename must be MainProgram.java.
Helper is a non-public (default access) class that supports the main class.
Useful for small helper utilities or related mini-classes. */