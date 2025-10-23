package chapter1;


public class InstanceIniLesson {
    int code;
    
    public static void main(String[] args) {
        InstanceIniLesson ini = new InstanceIniLesson();
        System.out.println("feathers");
    }

   {System.out.println(x:"snowy");} // instance initializer block
   code
   
}
class Bird {
    String name;
    
    // Instance initializer block
    {
        name = "Sparrow";
        System.out.println("Bird initialized: " + name);
    }
    
    public Bird() {
        System.out.println("Bird constructor called");
    }
    
    public static void main(String[] args) {
        Bird bird = new Bird();
    }
}


