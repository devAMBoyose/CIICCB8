public class Toy {
    String type;
    String color;
    double price;

    Toy(String type, String color, double price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    void play() {
        System.out.println("Playing with the " + color + " " + type + " toy.");
    }
}

