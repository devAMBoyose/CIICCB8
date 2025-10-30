// package Task121;

// public class DateTask {
//     // instance variables
//     byte day;
//     byte month;
//     short year;
//     // Constructors:

//     // The no-args constructor
//     public DateTask() {

//     }

//     // Constructor that takes 3 arguments
//     public DateTask(int m, int d, int y) {
//         setDate(m, d, y);
//     }

//     // Methods
//     public String toString() {
//         return month + "-" + day + "-" + year;
//     }

//     public void setDate(int m, int d, int y) {
//         if (valid(d, m, y)) {
//             day = (byte) d;
//             year = (short) y;
//             month = (byte) m;
//         } else {
//             day = (byte) 0;
//             year = (short) 0;
//             month = (byte) 0;
//         }
//     }

//     public static void leapYears() {
//         for (int i = 1980; i <= 2023; i = i + 4) {
//             if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
//                 System.out.println("The year " + i + " is a leap year");
//         }
//     }

//     public int getDay() {

//     }

//     public void setDay(int day) {
//         if (valid(day, month, year)) {
//             this.day = (byte) day;
//         }

//     }

//     public int getMonth() {

//     }

//     public void setMonth(int month) {
//         if (valid(day, month, year)) {
//             this.month = (byte) month;
//         } else {
//             this.month = (byte) 0;
//         }
//     }

//     public int getYear() {

//     }

//     public void setYear(int year) {
//         if (valid(day, month, year)) {
//             this.year = (short) year;
//         } else {
//             this.year = (short) 0;
//         }
//     }

//     private boolean valid(int day, int month, int year) {
//         if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1) {
//             System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
//             return false;
//         }
//         switch (month) {
//             case 4:
//             case 6:
//             case 9:
//             case 11:
//                 return (day <= 30);
//             case 2:
//                 return day <= 28 || (day == 29 && year % 4 == 0);
//         }
//         return true;
//     }
// }

package Task121;

public class DateTask {

    // 4) Make instance variables private
    private byte day;
    private byte month;
    private short year;

    // 5) No-args constructor with this(1,1,1)
    public DateTask() {
        this(1, 1, 1);
    }

    // Constructor with 3 arguments
    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }

    // 6) toString() method to display "12/12/2012" format (MM/DD/YYYY)
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    // Method to set full date (used by constructors)
    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            day = (byte) d;
            month = (byte) m;
            year = (short) y;
        } else {
            // 8) Set to 0 if condition is false
            day = 0;
            month = 0;
            year = 0;
        }
    }

    // 14) Static method to display leap years
    public static void leapYears() {
        for (int i = 1980; i <= 2023; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                System.out.println("The year " + i + " is a leap year");
            }
        }
    }

    // 7, 9, 11) Get methods
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // 8, 10, 12) Set methods (return 0 if invalid)
    public void setDay(int day) {
        if (valid(day, this.month, this.year)) {
            this.day = (byte) day;
        } else {
            this.day = 0;
        }
    }

    public void setMonth(int month) {
        if (valid(this.day, month, this.year)) {
            this.month = (byte) month;
        } else {
            this.month = 0;
        }
    }

    public void setYear(int year) {
        if (valid(this.day, this.month, year)) {
            this.year = (short) year;
        } else {
            this.year = 0;
        }
    }

    // checks month lengths + leap-year February validation
    private boolean valid(int day, int month, int year) {
        if (day < 1 || month < 1 || month > 12 || year < 1)
            return false;

        int maxDay = 31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2:
                boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                maxDay = leap ? 29 : 28;
                break;
        }
        return day <= maxDay;
    }
}