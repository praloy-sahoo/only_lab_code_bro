/*
praloy sahoo
002410501095
Every bank account holds an account no and a calculateInterest method. A customer can have a
“SavingsAccount” and/or a “CurrentAccount”. For current account, there is a method called
displayOverdraftAmount(). Different accounts can have different interest rates. User should be able
to verify the existence of an account, adding new account and displaying all accounts. Implement
appropriate objects utilizing inheritance and show its behavior from the parent class.
*/

import java.util.ArrayList;
import java.util.Scanner;

abstract class Account {
    protected int accountNo;
    protected double bal;

    Account(int accountNo, double bal) {
        this.accountNo = accountNo;
        this.bal = bal;
    }

    abstract double calculateInterest();

    void display() {
        System.out.print("ID: " + accountNo + " | Balance: " + bal);
    }
}

class SavingsAccount extends Account {
    private static final double interest_rate = 0.04;

    SavingsAccount(int acc, double bal) {
        super(acc, bal);
    }

    @Override
    double calculateInterest() {
        return interest_rate * bal;
    }
}

class CurrentAccount extends Account {
    private static final double interest_rate = 0.02;
    private double overdraft_limit = 10000;

    CurrentAccount(int acc, double bal) {
        super(acc, bal);
    }

    @Override
    double calculateInterest() {
        return interest_rate * bal;
    }

    void displayOverdraftAmount() {
        System.out.print(" | Overdraft Limit: " + overdraft_limit);
    }
}

public class Ques4 {

    
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static boolean account_exist(int acc_no) {
        for (Account a : accounts) {
            if (a.accountNo == acc_no)
                return true;
        }
        return false;
    }

    static void add_account() {
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Choose account type: ");
        int choice = sc.nextInt();

        System.out.print("Enter account no: ");
        int acc_no = sc.nextInt();

        if (account_exist(acc_no)) {
            System.out.println("Account already exists!");
            return;
        }

        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        if (choice == 1)
            accounts.add(new SavingsAccount(acc_no, bal));
        else if (choice == 2)
            accounts.add(new CurrentAccount(acc_no, bal));
    }

    static void display_accounts() {
        for (Account a : accounts) {
            a.display();
            System.out.print(" | Interest: " + a.calculateInterest());

            if (a instanceof CurrentAccount)
                ((CurrentAccount) a).displayOverdraftAmount();

            System.out.println();
        }
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Add Account");
            System.out.println("2. Verify Account");
            System.out.println("3. Display All Accounts");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    add_account();
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int id = sc.nextInt();
                    System.out.println(account_exist(id)
                            ? "Account exists."
                            : "Account does not exist.");
                    break;
                case 3:
                    display_accounts();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

