public class Toy {
    String name;
    String brand;
    double price; // Attribute to hold the price of the toy
    int quantity;

    void setPrice(double price) { // Method to set the price if changed
        if (this.price != price) {
            this.price = price; // 'this' refers to the current object's price
        }
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Range pink";
        toy1.brand = "ToyBrand";
        toy1.price = 10.99;
        toy1.quantity = 5;
        toy1.setPrice((toy1.price*0.5)); // Using the setPrice method to update the price detail divided by 2

    }

    class InnerToy1 {   
        
    }

    class InnerToy2 {   
        
    }

    class InnerToy3 {   
        
    } //multiple inner classes one public class only
}

//if you have multiple classes only one class can be public and the file name should be the same as the public class name