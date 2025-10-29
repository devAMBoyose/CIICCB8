package


/**
 * Toy Object
 * has property of name, brand, price, quantity
 * with a method of setPrice() where you can change 
 * the price state of Toy Object.
 */
public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price) {
        this.price = price;  // updates price
    }

    // Main method for Toy class
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Range pink";
        toy1.brand = "ToyBrand";
        toy1.price = 10.99;
        toy1.quantity = 5;
        toy1.setPrice(toy1.price * 0.5); // Using the setPrice method to update the price detail divided by 2
        System.out.println("Toy Name: " + toy1.name + " | Updated Price: " + toy1.price);
    }
}

// ============================
// Other inner classes (non-public)
// ============================

class InnerToy1 {
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        InnerToy1 toy = new InnerToy1();
        toy.name = "Inner Toy 1";
        toy.brand = "Inner Brand";
        toy.price = 10.50;
        toy.quantity = 3;
        toy.setPrice(toy.price * 0.8);
        System.out.println(
            "Name: " + toy.name + "\n" + //im adding new lines for better readability "\n"
            "Brand: " + toy.brand + "\n" +
            "Price: " + toy.price + "\n" +
            "Quantity: " + toy.quantity
        );
    }
}

class InnerToy2 { }
class InnerToy3 { }
class InnerToy4 { }
