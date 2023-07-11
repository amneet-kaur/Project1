package July8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        System.out.println("Please Enter One Choice from the List to Know the Address");
        System.out.println("-------List-------");
        System.out.println("      Pragra");
        System.out.println("     CN Tower");
        System.out.println("     Aquarium");
        System.out.println("-------------------");
        System.out.print("Enter Name from List :  ");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        switch ((choice.toLowerCase())) {

            case "pragra":
                System.out.println("Addrees of Pragra is : 110 Matheson Blvd W #160, Mississauga, ON L5R 4G7");
                break;

            case "cn tower":

                System.out.println("Address of CN Tower is : 290 Bremner Blvd, Toronto, ON M5V 3L9");
                break;

            case "aquarium":
                System.out.println("Address of Aquarium is : 288 Bremner Blvd, Toronto, ON M5V 3L9");
                break;

            default:
                System.out.println("Invalid Input...");

        }
    }
}
