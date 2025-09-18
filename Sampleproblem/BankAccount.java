package Sampleproblems;

class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Balance: " + this.balance);
            System.out.println("----------------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Ravi Kumar", 5000);
        BankAccount acc2 = new BankAccount(102, "Priya Sharma", 10000);
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
