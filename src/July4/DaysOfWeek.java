package July4;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        int weekDayNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7");
        weekDayNumber = scanner.nextInt();
        if (weekDayNumber == 0) {
            System.out.println("It is Sunday");
        } else if (weekDayNumber == 1) {
            System.out.println("It is Monday");
        } else if (weekDayNumber == 2) {
            System.out.println("It is Tuesday");
        } else if (weekDayNumber == 3) {
            System.out.println("It is Wednesday");
        } else if (weekDayNumber == 4) {
            System.out.println("It is Thursday");
        } else if (weekDayNumber == 5) {
            System.out.println("It is Friday");
        } else if (weekDayNumber == 6) {
            System.out.println("It is Saturday");
        } else {
            System.out.println("Invalid Input");
        }
    }
}

