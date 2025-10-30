// package Task121;

// import Task121.DateTask;

// public class MyDate {
//     public static void main(String[] args) {
//         DateTask date1 = new DateTask();
//         DateTask date2 = new DateTask();
//         System.out.println(date1.toString());
//         System.out.println(date2.toString());
//         // display leapyears
//     }
// }

// THIS IS MAIN CLASS RUNNING MyDate.java
// PROGRAM STARTS HERE..

package Task121;

public class MyDate {
    public static void main(String[] args) {
        // two date objects based on the instructions
        DateTask date1 = new DateTask(1, 1, 1978);
        DateTask date2 = new DateTask(9, 21, 1984);

        // Display dates
        System.out.println("Date 1: " + date1.toString());
        System.out.println("Date 2: " + date2.toString());

        // Display leap years
        System.out.println("\nLeap years between 1980–2023:");
        DateTask.leapYears();
    }
}
