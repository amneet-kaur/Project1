package july25;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Entered String is : " + name );
        System.out.println("Length of String is : " + name.length());
        
    }
}
