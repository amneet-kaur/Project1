package July8.loops;

import java.util.Scanner;

public class TableUsingWhile {
    public static void main(String[] args) {
        System.out.println("Welcome to Arithmatic Table Generator");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        int counter = 1;

        while (counter <= 10) {
            System.out.println(number + " * " + counter + " = " + number * counter);
            counter++;
        }
    }
}
