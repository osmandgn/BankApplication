package BankApp;

import java.util.Scanner;


public class BankApplication {

    public static Scanner input = new Scanner(System.in);

    public static void bankApp(){
        System.out.println("*".repeat(25) + "Welcome!!!, What do you want to do" + "*".repeat(25)+ "\n1 - Create New Account\n" +
                "2 - Create Bulk Account\n" +
                "3 - Delete an Account\n" +
                "4 - Quit");
        String choice = input.next();
        switch (choice){
            case "1":
                AccountCreator.accountCreator();
                break;
            case "2":
                System.out.println("Input CSV File Path: ");
                String file = input.next();
                BulkAccountCreator.bulkAccountCerator(file);
                break;
            case "3":
                System.out.println("Input Your Social Security Number: ");
                String sSn = input.next();
                System.out.println("Your account has been deleted successfully");
                break;
            case "4":
                System.out.println("Exiting the system");
                break;
            default:
                System.out.println("Invalid operation"); bankApp();


        }
    }



}
