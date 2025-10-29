public class FacultyRoom extends Office {

    public FacultyRoom(String officeId, String location, int capacity) {
        super(officeId, location, capacity);
        setFacultyRoom(true); // specialization of Office
    }

    public void facultyRules() {
        System.out.println("Virtual Room Starts @: quiet hours 2:30–4:00 PM; staff only.");
    }
}
