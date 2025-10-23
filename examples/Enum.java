// File: Day.java
// A java file defining an enumeration, which represents a fixed set of constants.

public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// File: TestDay.java
// Demonstrates how to use the Day enum.

public class TestDay {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);
    }
}
