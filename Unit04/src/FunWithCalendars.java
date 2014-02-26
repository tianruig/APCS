/*
 * Name: Tianrui Guo
 * Period: 5
 * Project: FunWithCalendars
 */

public class FunWithCalendars {

    private int month, day, year;

    public FunWithCalendars(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    // Checks to see if the date is valid (month and day are valid).
    public boolean isValid() {
        return isValidMonth() && isValidDay();
    }

    // Checks if year is leap year;
    private boolean isLeapYear() {
        return (year % 400 == 0) || ((year % 4 == 0) && !(year % 100 == 0));
    }

    // Checks to see if month is valid.
    private boolean isValidMonth() {
        return (month > 0 && month < 13);
    }

    // Checks to see if the day is valid in the month. 
    private boolean isValidDay() {
        if (day < 1 || day > 31) { // No day can be less than 1 or greater than 31.
            return false;
        } else if (month == 2 && day > 28 && !isLeapYear()) { // Feb. of non leap year cant be greater than 28.
            return false;
        } else if (month == 2 && day > 29) { // Leap years for Feb. have 29 days.
            return false;
        } else if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) { // Months with 30 days.
            return false;
        }
        return true;
    }

    // Gets the day of the week from the given date. 
    public String getDayOfWeek() {
        int totalDays = daysInPreviousYears() + daysInCurrentYear() + numLeapYrs();

        if (isLeapYear() && (month == 1 || (month == 2 && day < 29))) { // If it's a leap year and Feb. 29 hasn't passed yet.
            totalDays--;
        }

        switch (totalDays % 7) {
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            default:
                return "Friday";
        }

    }

    private int daysInPreviousYears() {
        return year * 365;
    }

    private int daysInCurrentYear() {
        int d = day;
        switch (month) {
            case 12:
                d += 30;
            case 11:
                d += 31;
            case 10:
                d += 30;
            case 9:
                d += 31;
            case 8:
                d += 31;
            case 7:
                d += 30;
            case 6:
                d += 31;
            case 5:
                d += 30;
            case 4:
                d += 31;
            case 3:
                d += 28;
            case 2:
                d += 31;
            default:
                return d;
        }
    }

    // Calculates the number of leap years.
    private int numLeapYrs() {
        return (year / 4) - (year / 100) + (year / 400);
    }

    public String toString() {
        return getDayOfWeek() + ", " + month + "/" + day + "/" + year;
    }
}
