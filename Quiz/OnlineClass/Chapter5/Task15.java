// 1. Interface
interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

// 2. Abstract class implementing Shape
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    // Constructor
    AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

// 3A. Circle class
class Circle extends AbstractShape {
    double radius;

    Circle(String color, double radius) {
        super(color, radius, radius); // length & width not really used
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// 3B. Rectangle class
class Rectangle extends AbstractShape {

    Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// 4. Main Class
public class Task15 {
    public static void main(String[] args) {

        Circle c = new Circle("Red", 5);
        Rectangle r = new Rectangle("Blue", 4, 6);

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Circle Perimeter: " + c.calculatePerimeter());

        System.out.println("Rectangle Area: " + r.calculateArea());
        System.out.println("Rectangle Perimeter: " + r.calculatePerimeter());
    }
}