package Quiz.SchoolSystemUMLDiagram;

import Quiz.SchoolSystemUMLDiagram.SchoolDepartment.*; // Department, Teacher, Office, FacultyRoom, School

public class Main {
    public static void main(String[] args) {
        // Build the model
        School school = new School("CIICC Integrated School");

        // Offices (1..*)
        Office officeA = new Office("O-A", "Main Bldg 1F", 10);
        Office officeB = new Office("O-B", "Annex 2F", 8);
        FacultyRoom facultyRoom = new FacultyRoom("FR-1", "Main Bldg 2F", 20);

        school.addOffice(officeA);
        school.addOffice(officeB);
        school.designateFacultyRoom(facultyRoom); // exactly 1

        // Departments (1..*)
        Department cs   = new Department("CS",   "Computer Studies");
        Department math = new Department("MATH", "Mathematics");
        school.addDepartment(cs);
        school.addDepartment(math);

        // Departments are located in 1..* Offices
        cs.addOffice(officeA);
        cs.addOffice(facultyRoom);     // allowed near faculty room
        math.addOffice(officeB);

        // Teachers (1..*)
        Teacher t1 = new Teacher("T001", "Ana Boyose",  "Java");
        Teacher t2 = new Teacher("T002", "Krystel D.",  "DBMS");
        Teacher t3 = new Teacher("T003", "Jason P.",    "Calculus");

        cs.addTeacher(t1);
        cs.addTeacher(t2);
        math.addTeacher(t3);

        // Master teacher (exactly 1 in each department)
        cs.assignMaster(t1);
        math.assignMaster(t3);

        // Demo actions
        facultyRoom.facultyRules();
        t1.teach();
        officeA.reserve();

        // Summary
        System.out.println("\n=== SCHOOL JAVA DETAILS ===");
        System.out.println(school);
        school.getDepartments().forEach(d -> {
            System.out.println(" - " + d);
            d.getOffices().forEach(o -> System.out.println("    * located in: " + o));
            d.listTeachers().forEach(t -> System.out.println("    * teacher: " + t));
        });
    }
}
