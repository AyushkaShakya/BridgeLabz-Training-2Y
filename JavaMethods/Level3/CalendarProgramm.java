package string;

import java.util.Scanner;

public class CalendarProgramm {

    private static final String[] MONTHS = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final int[] DAYS_IN_MONTH = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) return 29;
        return DAYS_IN_MONTH[month];
    }

    public static int getStartDay(int year, int month) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m0) / 12) % 7;
    }

    public static void printCalendar(int year, int month) {
        System.out.println("   " + MONTHS[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int startDay = getStartDay(year, month);
        int numberOfDays = getNumberOfDaysInMonth(year, month);

        for (int i = 0; i < startDay; i++) {
            System.out.printf("%3s ", "");
        }

        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        printCalendar(year, month);
        sc.close();
    }
}
