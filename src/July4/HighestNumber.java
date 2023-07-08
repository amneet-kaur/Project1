package July4;

import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter num1 : ");
        num1 = scanner.nextInt();
        System.out.print("Please Enter num2 : ");
        num2 = scanner.nextInt();
        System.out.print("Please Enter num3 : ");
        num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greatest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("num3 is greatest");
        }
    }
}
