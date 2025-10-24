public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    void setPrice(double price) {
        this.price = price;  // updates price
    }
    
        public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Range pink";
        toy1.brand = "ToyBrand";
        toy1.price = 10.99;
        toy1.quantity = 5;
        toy1.setPrice((toy1.price*0.5)); // Using the setPrice method to update the price detail divided by 2

    }
    //multiple inner classes one public class only
}

class InnerToy1 {

}

class InnerToy2 {

}

class InnerToy3 {

}