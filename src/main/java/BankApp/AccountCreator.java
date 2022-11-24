package BankApp;

import java.util.Scanner;

public class AccountCreator {
    public static Scanner input = new Scanner(System.in);


    public static Accounts accountCreator() {
        System.out.println("Input Name: ");
        String name = input.nextLine();
        System.out.println("Input Social Security Number: ");
        String sSN = input.next();
        System.out.println("Choose Account Type \"S\" for Savings, \"C\" for Checking Account: ");
        String choice = input.next();
        System.out.print("Input Initial Balance: ");
        int balance = input.nextInt();
        System.out.println("Your account has been successfully created");

        if (choice.equals("S")) {
            return new SavingsAccount(name, sSN, balance);
        } else
            return new CheckingAccount(name, sSN, balance);

    }


}