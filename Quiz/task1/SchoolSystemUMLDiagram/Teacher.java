import java.util.Objects;

public class Teacher {
    private final String teacherId;
    private String fullName;
    private String specialization;
    private Department assignedTo; // exactly 1 department

    public Teacher(String teacherId, String fullName, String specialization) {
        this.teacherId = Objects.requireNonNull(teacherId);
        this.fullName = Objects.requireNonNull(fullName);
        this.specialization = Objects.requireNonNull(specialization);
    }

    public void teach() {
        System.out.println(fullName + " is teaching " + specialization + ".");
    }

    /* package-private */ void setAssignedTo(Department dept) {
        this.assignedTo = dept;
    }

    public Department getAssignedTo() { return assignedTo; }
    public String getTeacherId() { return teacherId; }
    public String getFullName() { return fullName; }
    public String getSpecialization() { return specialization; }

    @Override public String toString() {
        return "Teacher{" + teacherId + ", " + //
                        " " + fullName + ", " + specialization + "}";
    }
}
