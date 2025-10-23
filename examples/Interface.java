// File: Animal.java
// A .java file that defines an interface, containing method declarations only.
// Interfaces are implemented by classes.

public interface Animal {
    void eat();
    void sleep();
}

/*Methods in interfaces are abstract by default (no body).
Other classes use *implements* to provide behavior: */
// Example implementation class

public class Dog implements Animal {
    public void eat() { System.out.println("Dog eats."); }
    public void sleep() { System.out.println("Dog sleeps."); }
}