import java.util.*;

public class Department {
    private final String deptId;
    private String name;
    private final Set<Teacher> teachers = new LinkedHashSet<>(); // 1..*
    private final Set<Office> offices = new LinkedHashSet<>();   // located in 1..*
    private Teacher masterTeacher;                                // exactly 1

    public Department(String deptId, String name) {
        this.deptId = Objects.requireNonNull(deptId);
        this.name = Objects.requireNonNull(name);
    }

    public void addTeacher(Teacher t) {
        Objects.requireNonNull(t);
        teachers.add(t);
        t.setAssignedTo(this); // keep bidirectional link
    }

    public void addOffice(Office o) {
        Objects.requireNonNull(o);
        offices.add(o);
        o.addHostedDepartment(this); // 0..* host link on Office side
    }

    public void assignMaster(Teacher t) {
        if (!teachers.contains(t)) {
            throw new IllegalArgumentException(
                "Master teacher must belong to this department.");
        }
        this.masterTeacher = t;
    }

    public Set<Teacher> listTeachers() { return Collections.unmodifiableSet(teachers); }
    public Set<Office> getOffices() { return Collections.unmodifiableSet(offices); }
    public Teacher getMasterTeacher() { return masterTeacher; }

    @Override public String toString() {
        return "Department{" + deptId + ", " + name +
               ", teachers=" + teachers.size() +
               ", offices=" + offices.size() +
               ", master=" + (masterTeacher == null ? "n/a" : masterTeacher.getFullName()) + "}";
    }
}
