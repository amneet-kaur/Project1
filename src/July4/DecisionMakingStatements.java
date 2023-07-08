package July4;

import java.util.Scanner;

public class DecisionMakingStatements {
    public static void main(String[] args) {
        int number, year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("This is an Even Number");
        } else {
            System.out.println("This is an Odd Number");
        }
        year = scanner.nextInt();
        System.out.println("Please Enter a Year: ");
        if (year % 4 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("Not a leap year");
        }

    }
}
