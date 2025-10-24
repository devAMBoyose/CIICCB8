  // Create and instance a Toy object

        /* this is multiline comment
         * Toy toy1 = new Toy();
         * toy1.name = "Range pink";
         * toy1.brand = "ToyBrand";
         * toy1.price = 10.99;
         * toy1.quantity = 5;
         */

public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Range pink";
        toy1.brand = "ToyBrand";
        toy1.price = 10.99;
        toy1.quantity = 5;

        toy1.setPrice(toy1.price * 0.5); // divide by 2

        System.out.println("Toy Name: " + toy1.name);
        System.out.println("Toy Brand: " + toy1.brand);
        System.out.println("Toy Price: $" + toy1.price);
        System.out.println("Toy Quantity: " + toy1.quantity);
    }
}

