package July8;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to My Calculator");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter Second Number : ");
        float num2 = scanner.nextFloat();
        System.out.println("_______________________");
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Modulus");
        System.out.println("________________________");
        System.out.print("Enter Your Choice : ");
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {

            case 1:
                System.out.println("The Addition of " + num1 + " and " + num2 + " is : ");
                System.out.println(num1 + num2);
                break;

            case 2:
                System.out.println("The Subraction of " + num1 + " and " + num2 + " is : ");
                System.out.println(num1 - num2);
                break;

            case 3:
                System.out.print("The Multiplication of " + num1 + " and " + num2 + " is : ");
                System.out.println(num1 * num2);
                break;

            case 4:
                System.out.print("The Division of " + num1 + " and " + num2 + " is : ");
                System.out.print(num1 / num2);
                break;

            case 5:
                System.out.print("The Modulus of " + num1 + " and " + num2 + " is : ");
                System.out.println(num1 % num2);
                break;

            default:
                System.out.println("Invalid Input...");

        }
    }
}
