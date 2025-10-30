// package Task13;

// class Afritada {
//     public void showIngredients() {
//         String[] Ingredients = { "Tomato Sauce", "Meat" };
//         System.out.println("Afritada = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
//     }
// }
// // extend Afritada Class here

// class Caldereta extends Afritada {
//     public void showIngredients() {
//         String[] Ingredients = { "Tomato Sauce",
//                 "Meat",
//                 "Potatoes & Carrots",
//                 "Tomato Paste",
//                 "Liver Spread",
//                 "Raisins",
//                 "Hotdog",
//                 "Siling Labuyo",
//                 "Cheese" };
//         System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
//     }
// }

// public class Task131 {
//     public static void main(String[] args) {
//         // add 4 meal$ objects here and set the type as the extended Afritada class
//         Afritada meal1 = new Afritada();

//         Afritada meal4 = new Caldereta();
//         // display all ingredients at every object
//         meal1.showIngredients();

//     }
// }

// package 😡😡😡😡😡 bleeh Task13  ;

package Task131;

// Base class
class Afritada {
    public void showIngredients() {
        String[] ingredients = {
                "Tomato Sauce",
                "Meat"
        };
        System.out.println("Afritada ingredients: 2");
        for (String item : ingredients) {
            System.out.println(" - " + item);
        }
        System.out.println();
    }
}

// Mechado class extends Afritada
class Mechado extends Afritada {
    public void showIngredients() {
        String[] ingredients = {
                "Tomato Sauce",
                "Meat",
                "Potatoes & Carrots",
                "Tomato Paste"
        };
        System.out.println("Mechado ingredients: 4");
        for (String item : ingredients) {
            System.out.println(" - " + item);
        }
        System.out.println();
    }
}

// Menudo class extends Afritada
class Menudo extends Afritada {
    public void showIngredients() {
        String[] ingredients = {
                "Tomato Sauce",
                "Meat",
                "Potatoes & Carrots",
                "Liver Spread",
                "Raisins",
                "Hotdog"
        };
        System.out.println("Menudo ingredients: 6");
        for (String item : ingredients) {
            System.out.println(" - " + item);
        }
        System.out.println();
    }
}

// Caldereta class extends Afritada
class Caldereta extends Afritada {
    public void showIngredients() {
        String[] ingredients = {
                "Tomato Sauce",
                "Meat",
                "Potatoes & Carrots",
                "Liver Spread",
                "Tomato Paste",   
                "Raisins",
                "Hotdog",
                "Cheese"
        };
        System.out.println("Caldereta ingredients: 8");
        for (String item : ingredients) {
            System.out.println(" - " + item);
        }
        System.out.println();
    }
}

// Main class
public class Task131 {
    public static void main(String[] args) {

        // Create 4 objects using polymorphism
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Mechado();
        Afritada meal3 = new Menudo();
        Afritada meal4 = new Caldereta();

        // Display all ingredients
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
        meal4.showIngredients();
    }
}
