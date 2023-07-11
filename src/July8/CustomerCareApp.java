package July8;

import java.util.Scanner;

public class CustomerCareApp {
    public static void main(String[] args) {
        System.out.print("Welcome to Customer Support");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________________");
        System.out.println("Enter 1 for Chequing Account");
        System.out.println("Enter 2 for Savings Account");
        System.out.println("Enter 3 for Credit Card");
        System.out.println("Enter 0 to speak with a Customer Care Representative");
        System.out.println("________________________");
        System.out.print("Enter Your Choice : ");
        int choice = scanner.nextInt();
        System.out.println();

        switch (choice) {

            case 1:
                System.out.println("---Chequing Account---");
                System.out.println("Enter 1 for Chequing Account Balance");
                System.out.println("Enter 2 for Tranferring Money to Another Account");
                System.out.println("Enter 3 for Bill Payment");
                choice = scanner.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        System.out.println("Your Chequing Account Balance is $5000");
                        break;

                    case 2:
                        System.out.println("$100 Transferred to Savings Account");
                        break;

                    case 3:
                        System.out.println("Please Select Bill Payee from the Following Registered Bills");
                        System.out.println("1 -> Enbridge");
                        System.out.println("2 -> Waterloo North Hydro");
                        System.out.println("3 -> Enova Power Corp");
                        choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.println("Please Enter the amount to be paid to Enbridge Account");
                                int amount = scanner.nextInt();
                                System.out.println("An Amount of $" + amount + " has been paid to Enbridge Account");
                                break;

                            case 2:
                                System.out.println("Please Enter the amount to be paid to Waterloo North Hydro Account");
                                amount = scanner.nextInt();
                                System.out.println("An Amount of $" + amount + " has been paid to Waterloo North Hydro Account");
                                break;

                            case 3:
                                System.out.println("Please Enter the amount to be paid to Enova Power Corp Account");
                                amount = scanner.nextInt();
                                System.out.println("An Amount of $" + amount + " has been paid to Enova Power Corp Account");
                                break;

                            default:
                                System.out.println("Invalid Input Entered .... Bye Bye" );
                                break;
                        }
                }
                break;

            case 2:
                System.out.println("---Savings Account---");
                System.out.println("Enter 1 for Savings Account Balance");
                System.out.println("Enter 2 for Tranferring Money to Another Account");
                choice = scanner.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        System.out.println("Your Savings Account Balance is $500000");
                        break;

                    case 2:
                        System.out.println("$100 Transferred to Chequing Account");
                        break;
                    default:
                        System.out.println("Invalid Input Entered .... Bye Bye" );
                        break;
                }
                break;

            case 3:
                System.out.println("---Credit Card---");
                System.out.println("Enter 1 for Credit Card Balance");
                System.out.println("Enter 2 for Payment Due Date");
                System.out.println("Enter 3 for Locking your Credit Card");

                switch (choice) {
                    case 1:
                        System.out.println("Your Credit Card Balance is $1000");
                        break;

                    case 2:
                        System.out.println("Your Payment Due Date is 20 July 2023");
                        break;
                }
                break;

            case 0:
                System.out.println("Please Wait While We Connect You with One of Our Representatives");
                break;

            default:
                System.out.println("Invalid Input Entered .... Bye Bye" );
                break;
        }
    }
}
