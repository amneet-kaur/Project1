package july11;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter First Number :");
        int num1 = scanner.nextInt();
        System.out.print("Please Enter Second Number : ");
        int num2 = scanner.nextInt();
        System.out.print("Please Enter Third Number : ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num1 == num3) {
            System.out.println("All Numbers are Equal");
        } else if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the Greatest Number");
        } else if (num2 > num3) {
            System.out.println(num2 + " is the Greatest Number");
        } else {
            System.out.println(num3 + " is the Greatest Number");
        }
    }
}
