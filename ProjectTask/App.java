import java.util.*;

// ---------- Teacher ----------
class Teacher {
    private final int id;
    private String fullName;
    private String specialization;

    public Teacher(int id, String fullName, String specialization) {
        this.id = id;
        this.fullName = fullName;
        this.specialization = specialization;
    }

    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public String getSpecialization() { return specialization; }

    public void setFullName(String n) { this.fullName = n; }
    public void setSpecialization(String s) { this.specialization = s; }

    @Override
    public String toString() {
        return fullName + " (" + specialization + ")";
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Teacher t) && t.id == this.id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}

// ---------- Office ----------
class Office {
    private final int id;
    private String name;
    private String location;

    public Office(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getLocation() { return location; }

    public void setName(String n) { this.name = n; }
    public void setLocation(String l) { this.location = l; }

    @Override
    public String toString() { return name + " @ " + location; }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Office off) && off.id == this.id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}

// ---------- FacultyRoom (special Office) ----------
class FacultyRoom extends Office {
    public FacultyRoom(int id, String name, String location) {
        super(id, name, location);
    }
}

// ---------- Department ----------
class Department {
    private final String name;
    private final List<Teacher> teachers = new ArrayList<>();
    private final Set<Office> offices = new LinkedHashSet<>();

    private Teacher masterTeacher;      // 1
    private FacultyRoom facultyRoom;    // 0..1

    public Department(String name) { this.name = name; }

    public String getName() { return name; }
    public List<Teacher> getTeachers() { return Collections.unmodifiableList(teachers); }
    public Set<Office> getOffices() { return Collections.unmodifiableSet(offices); }
    public Optional<Teacher> getMasterTeacher() { return Optional.ofNullable(masterTeacher); }
    public Optional<FacultyRoom> getFacultyRoom() { return Optional.ofNullable(facultyRoom); }

    public void addTeacher(Teacher t) {
        if (t == null) throw new IllegalArgumentException("Teacher cannot be null");
        if (!teachers.contains(t)) teachers.add(t);
    }

    public void assignMasterTeacher(Teacher t) {
        if (!teachers.contains(t))
            throw new IllegalArgumentException("Master teacher must be one of this department's teachers.");
        this.masterTeacher = t;
    }

    public void addOffice(Office o) {
        if (o == null) throw new IllegalArgumentException("Office cannot be null");
        offices.add(o);
    }

    public void setFacultyRoom(FacultyRoom room) {
        this.facultyRoom = room;       // 0..1
        if (room != null) offices.add(room); // ensure it’s among offices
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "', teachers=" + teachers.size() +
               ", offices=" + offices.size() +
               ", masterTeacher=" + (masterTeacher != null ? masterTeacher.getFullName() : "none") +
               ", facultyRoom=" + (facultyRoom != null ? facultyRoom.getName() : "none") + "}";
    }
}

// ---------- School ----------
class School {
    private final String name;
    private final List<Department> departments = new ArrayList<>();

    public School(String name) { this.name = name; }

    public String getName() { return name; }
    public List<Department> getDepartments() { return Collections.unmodifiableList(departments); }

    public void addDepartment(Department d) {
        if (d == null) throw new IllegalArgumentException("Department cannot be null");
        departments.add(d);
    }

    @Override
    public String toString() {
        return "School{name='" + name + "', departments=" + departments.size() + "}";
    }
}

// ---------- App (demo) ----------
public class App {
    public static void main(String[] args) {
        School school = new School("Arete High School");

        Department science = new Department("Science");
        Department math = new Department("Mathematics");
        school.addDepartment(science);
        school.addDepartment(math);

        Teacher t1 = new Teacher(1, "Dr. Ana Cruz", "Biology");
        Teacher t2 = new Teacher(2, "Engr. Ben Santos", "Physics");
        Teacher t3 = new Teacher(3, "Ms. Carla Dizon", "Algebra");

        science.addTeacher(t1);
        science.addTeacher(t2);
        math.addTeacher(t3);

        Office sciA = new Office(101, "Sci Office A", "North Wing 2F");
        FacultyRoom sciFaculty = new FacultyRoom(102, "Sci Faculty Room", "North Wing 2F");
        science.addOffice(sciA);
        science.setFacultyRoom(sciFaculty);

        science.assignMasterTeacher(t1);
        math.assignMasterTeacher(t3);

        System.out.println(school);
        for (Department d : school.getDepartments()) {
            System.out.println(d);
        }
    }
}
