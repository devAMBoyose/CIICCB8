interface Animal {
    boolean feed(boolean timeToEat);

    void groom();

    void pet();
}

// Gorilla class implementing Animal interface
class Gorilla implements Animal {

    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Gorilla is eating.");
            return true;
        } else {
            System.out.println("Gorilla is not hungry.");
            return false;
        }
    }

    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla...");
    }

    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla...");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla g = new Gorilla();

        g.feed(true);
        g.groom();
        g.pet();
    }
}