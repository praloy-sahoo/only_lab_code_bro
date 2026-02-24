import java.util.Scanner;

/* ================= PARENT CLASS ================= */
abstract class Account {
    protected int accountNumber;
    protected double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // abstract method (must be overridden)
    abstract double calculateInterest();

    void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}

/* ================= SAVINGS ACCOUNT ================= */
class SavingsAccount extends Account {

    private static final double INTEREST_RATE = 0.04; // 4%

    SavingsAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

/* ================= CURRENT ACCOUNT ================= */
class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 0.02; // 2%
    private double overdraftLimit = 10000;

    CurrentAccount(int accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    void displayOverdraftAmount() {
        System.out.println("Overdraft Limit : " + overdraftLimit);
    }
}

/* ================= MAIN CLASS ================= */
public class BankDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account acc = null;
        int choice;

        do {
            System.out.println("\n----- BANK MENU -----");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Calculate Interest");
            System.out.println("4. Display Account Details");
            System.out.println("5. Display Overdraft (Current Account)");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int saNo = sc.nextInt();
                    System.out.print("Enter Balance: ");
                    double saBal = sc.nextDouble();
                    acc = new SavingsAccount(saNo, saBal);
                    System.out.println("Savings Account Created!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int caNo = sc.nextInt();
                    System.out.print("Enter Balance: ");
                    double caBal = sc.nextDouble();
                    acc = new CurrentAccount(caNo, caBal);
                    System.out.println("Current Account Created!");
                    break;

                case 3:
                    if (acc != null) {
                        System.out.println("Interest Amount: " + acc.calculateInterest());
                    } else {
                        System.out.println("No account exists!");
                    }
                    break;

                case 4:
                    if (acc != null) {
                        acc.displayAccount();
                    } else {
                        System.out.println("No account exists!");
                    }
                    break;

                case 5:
                    if (acc instanceof CurrentAccount) {
                        CurrentAccount ca = (CurrentAccount) acc;
                        ca.displayOverdraftAmount();
                    } else {
                        System.out.println("Not a Current Account!");
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
