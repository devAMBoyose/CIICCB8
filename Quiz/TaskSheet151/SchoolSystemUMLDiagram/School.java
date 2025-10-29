import java.util.*;

public class School {
    private String name;
    private final List<Department> departments = new ArrayList<>(); // 1..*
    private final List<Office> offices = new ArrayList<>();         // 1..*
    private FacultyRoom facultyRoom;                                 // exactly 1

    public School(String name) { this.name = Objects.requireNonNull(name); }

    public void addDepartment(Department d) { departments.add(Objects.requireNonNull(d)); }
    public List<Department> getDepartments() { return Collections.unmodifiableList(departments); }

    public void addOffice(Office o) { offices.add(Objects.requireNonNull(o)); }
    public List<Office> getOffices() { return Collections.unmodifiableList(offices); }

    public void designateFacultyRoom(FacultyRoom fr) {
        this.facultyRoom = Objects.requireNonNull(fr);
        if (!offices.contains(fr)) offices.add(fr); // the designated office is part of school offices
    }
    public FacultyRoom getFacultyRoom() { return facultyRoom; }

    @Override public String toString() {
        return "School{" + name + ", departments=" + departments.size() +
               ", offices=" + offices.size() + ", facultyRoom=" +
               (facultyRoom == null ? "n/a" : facultyRoom.toString()) + "}";
    }
}
