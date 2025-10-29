import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Office {
    private final String officeId;
    private String location;
    private int capacity;
    private boolean isFacultyRoom; // true only for the designated faculty room
    private final Set<Department> hosts = new LinkedHashSet<>(); // 0..* departments

    public Office(String officeId, String location, int capacity) {
        this.officeId = Objects.requireNonNull(officeId);
        this.location = Objects.requireNonNull(location);
        this.capacity = capacity;
    }

    public void reserve() {
        System.out.println("Office " + officeId + " reserved.");
    }

    /* package-private */ void addHostedDepartment(Department d) { hosts.add(d); }
    public Set<Department> getHostedDepartments() { return hosts; }

    public boolean isFacultyRoom() { return isFacultyRoom; }
    /* package-private */ void setFacultyRoom(boolean val) { isFacultyRoom = val; }

    @Override public String toString() {
        return "Office{" + officeId + ", " + location + ", cap=" + capacity +
               (isFacultyRoom ? ", FacultyRoom" : "") + "}";
    }
}
