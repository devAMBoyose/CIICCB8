class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Your code here
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}

public class Task10 {
    public static void main(String[] args) {

        Student[] students = new Student[] {
                new Student("Juan", "Tamad"),
                new Student("Justine", "Paangit"),
                new Student("Bam", "Pogi")
        };

        for (Student s : students) {
            s.printFullName();
        }
    }
}
