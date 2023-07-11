package July8;

import java.util.Scanner;

public class CalculatorWithCharacterInput {
    public static void main(String[] args) {
        System.out.println("______________________________");
        System.out.println("    For Addition Press +");
        System.out.println("    For Subtraction Press -");
        System.out.println("    For Multiplication, Press *");
        System.out.println("    For Division, Press /");
        System.out.println("    For Modulus, Press %");
        System.out.println("_______________________________");
        System.out.println();
        System.out.print("Enter Your Choice : ");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);

        if (choice == '+') {
            System.out.print("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.print("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.print("The Sum of " + num1 + " and " + num2 + " is : " + num1 + num2);

        } else if (choice == '-') {
            System.out.println("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.println("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.println("The Subration of " + num1 + " and " + num2 + " is : ");
            System.out.println(num1 - num2);

        } else if (choice == '*') {
            System.out.print("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.print("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.print("The Multiplication of " + num1 + " and " + num2 + " is : ");
            System.out.println(num1 * num2);

        } else if (choice == '/') {
            System.out.print("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.print("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.print("The Division of " + num1 + " and " + num2 + " is : ");
            System.out.print(num1 / num2);

        } else if (choice == '%') {
            System.out.print("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.print("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.print("The Modulus of " + num1 + " and " + num2 + " is : ");
            System.out.println(num1 % num2);

        } else {
            System.out.print("Invalid Input Entered...");
        }
    }
}
