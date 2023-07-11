package July8;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("_______________________");
        System.out.println("    1. Addition");
        System.out.println("    2. Subtraction");
        System.out.println("    3. Multiplication");
        System.out.println("    4. Division");
        System.out.println("    5. Modulus");
        System.out.println("________________________");
        System.out.println("Enter Your Choice : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.println("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.println("The Addition of " + num1 + "and" + num2 + " is : ");
            System.out.println(num1 + num2);
        } else if (choice == 2) {
            System.out.println("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.println("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.println("The output is : ");
            System.out.println(num1 - num2);
        } else if (choice == 3) {
            System.out.println("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.println("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.println("The output is : ");
            System.out.println(num1 * num2);
        } else if (choice == 4) {
            System.out.println("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.println("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.println("The output is : ");
            System.out.println(num1 / num2);
        } else if (choice == 5) {
            System.out.println("Enter First Number : ");
            float num1 = scanner.nextFloat();
            System.out.println("Enter Second Number : ");
            float num2 = scanner.nextFloat();
            System.out.println("The output is : ");
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid Input Entered...");
        }
    }
}
