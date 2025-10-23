// File: Shape.java
// Contains abstract methods (no body) and concrete methods (with body).
// It cannot be instantiated directly.

public abstract class Shape {
    abstract void draw();
    void display() {
        System.out.println("Displaying shape");
    }
}

/*Classes that extend Shape must implement the abstract method draw().
Abstract classes are used for base or blueprint classes. */