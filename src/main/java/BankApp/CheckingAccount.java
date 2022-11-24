package BankApp;

public class CheckingAccount extends Accounts {
    final String accountType = "Checking Account";
    int debitCardNumber;
    int debitCardPIN;
    final int accountTypeCode = 1;


    public CheckingAccount(String name, String socialSecurityNumber, int initDeposit) {
        super(name, socialSecurityNumber, initDeposit);
        accountNumber = accountTypeCode + accountNumber;
        setDebitCardNumber();
        showInfo();


    }

    private void setDebitCardNumber(){
        debitCardNumber = (int)(Math.random() * Math.pow(100, 5));
        debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
    }

    @Override
    public double baseRate() {
        return 0.15;
    }

    @Override
    public void showInfo() {
        System.out.println("Name = " + name +
                "\nAccountNumber = " + accountNumber +
                "\nBalance = " + balance +
                "\nAccount Type = " + accountType +
                "\n Card Number = " + debitCardNumber +
                "\n PIN  = " + debitCardPIN);

    }


}