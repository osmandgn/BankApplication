package BankApp;

public abstract class Accounts{
    String name;
    String socialSecurityNumber;
    String accountNumber;
    double balance;
    double rate;
    static int counter = 10000;


    public Accounts(String name, String socialSecurityNumber, int initDeposit){
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        balance = initDeposit;
        counter++;
        this.accountNumber = setAccountNumber();
        System.out.println("****************** Account Informations ******************");
    }

    private String setAccountNumber(){
        String lastTwoOfSSN = socialSecurityNumber.substring(socialSecurityNumber.length()-2);
        int randomNumber = (int) (Math.random()* Math.pow(10,3));
        return lastTwoOfSSN + counter + randomNumber;
    }

    public abstract void showInfo();
    public abstract double baseRate();



}
