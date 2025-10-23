public class Main {
    public static void main(String[] args) {    
        System.out.println("Hello World");
        Student student = new Student();
        student.name = "Alice";
        student.age = 20;
        student.grade = 20;
        student.address = "123 Main St";
        //*Writing Object */
        Student student2 = new Student("Alice", 20, 20, "123 Main St");
        System.out.println("Student Name: " + student2.name);
        System.out.println("Student Age: " + student2.age);
        System.out.println("Student Grade: " + student2.grade);
        System.out.println("Student Address: " + student2.address);
    }
}
/*
 * 
 * 
 * 
 * 
 */
class Student {
    String name;
    int age;
    int grade;
    String address;

    Student(String name, int age, int grade, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.address = address; 
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}

class gradeCalculator {
    static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}   