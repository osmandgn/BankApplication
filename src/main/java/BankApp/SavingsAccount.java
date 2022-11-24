package BankApp;

public class SavingsAccount extends Accounts {

    final String accountType = "Savings Account";
    int depositBoxID;
    int depositBoxKey;
    final int accountTypeCode = 2;

    public SavingsAccount(String name, String socialSecurityNumber, int initDeposit) {
        super(name, socialSecurityNumber, initDeposit);
        accountNumber = accountTypeCode + accountNumber;
        setDepositBox();
        showInfo();


    }

    private void setDepositBox() {
        depositBoxID = (int) (Math.random() * Math.pow(10, 3));
        depositBoxKey = (int) (Math.random() * Math.pow(10, 4));

    }

    @Override
    public void showInfo() {
        System.out.println("Name = " + name +
                "\nAccountNumber = " + accountNumber +
                "\nBalance = " + balance +
                "\nAccount Type = " + accountType +
                "\n Deposit Box ID = " + depositBoxID +
                "\n Depostit Box KEY = " + depositBoxKey);
    }

    @Override
    public double baseRate() {
        return 0.15;
    }
}