import java.util.Scanner;

abstract class Customer {
    protected final int customerId;
    protected String name;
    protected String phoneNumber;
    protected double currentLoanAmount;

    public Customer(int id, String name, String phone) {
        this.customerId = id;
        this.name = name;
        this.phoneNumber = phone;
        this.currentLoanAmount = 0;
    }

    public abstract double getCreditLimit();

    public void requestLoan(double amount) {
        if (currentLoanAmount + amount <= getCreditLimit()) {
            currentLoanAmount += amount;
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan exceeds credit limit");
        }
    }

    public double getAvailableLoan() {
        return getCreditLimit() - currentLoanAmount;
    }

    public void displayDetails() {
        System.out.println("Customer ID    : " + customerId);
        System.out.println("Name           : " + name);
        System.out.println("Phone          : " + phoneNumber);
        System.out.println("Current Loan   : " + currentLoanAmount);
        System.out.println("Credit Limit   : " + getCreditLimit());
        System.out.println("Available Loan : " + getAvailableLoan());
    }
}

class NormalCustomer extends Customer {
    private static final double CREDIT_LIMIT = 100000;
    public NormalCustomer(int id, String name , String phone){
        super(id,name,phone);
    }
    @Override
    public double getCreditLimit() { return CREDIT_LIMIT; }
}

class PrivilegedCustomer extends Customer {
    private static final double CREDIT_LIMIT = 200000;
    public PrivilegedCustomer(int id, String name, String phone) { 
        super(id, name, phone); 
    }
    @Override
    public double getCreditLimit() { return CREDIT_LIMIT; }
}

public class Bank {
    
    private static Customer[] customers = new Customer[100]; 
    private static int customer_count = 0; 
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n BANK MENU ");
            System.out.println("1. Create Normal Customer");
            System.out.println("2. Create Privileged Customer");
            System.out.println("3. Request Loan");
            System.out.println("4. View Details");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    createCustomer(choice);
                    break;
                case 3:
                    performLoanRequest();
                    break;
                case 4:
                    viewCustomerDetails();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void createCustomer(int type) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        // for id
        for (int i = 0; i < customer_count; i++) {
            if (customers[i].customerId == id) {
                System.out.println(" Id  already exists");
                return;
            }
        }

        sc.nextLine(); // Clear buffer
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        if (type == 1) {
            customers[customer_count] = new NormalCustomer(id, name, phone);
        } else {
            customers[customer_count] = new PrivilegedCustomer(id, name, phone);
        }

        customer_count++;
        System.out.println("Customer Created Successfully!");
    }

    private static void performLoanRequest() {
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        
        for (int i = 0; i < customer_count; i++) {
            if (customers[i].customerId == id) {
                System.out.print("Enter Loan Amount: ");
                double amount = sc.nextDouble();
                customers[i].requestLoan(amount);
                return;
            }
        }
        System.out.println("Customer not found!");
    }

    private static void viewCustomerDetails() {
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < customer_count; i++) {
            if (customers[i].customerId == id) {
                customers[i].displayDetails();
                return;
            }
        }
        System.out.println("Customer not found!");
    }
}