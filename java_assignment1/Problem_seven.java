/*

7. Design a BankAcct class with account number, balance and interest rate as attribute. Interest
rate is same for all account. Support must be there to initialize, change and display the interest rate.
Also supports are to be there to return balance and calculate interest.
*/
import java.util.Scanner;
class BankAcct{
    int account_number;
    double balance;
    static double interest_rate;
     void get_interest(double interest){
        BankAcct.interest_rate = interest;
    }
     void chnage_interest(double x){
        BankAcct.interest_rate = x;
    }
       void show_interese(){
        System.out.println("the intereset for account is "+interest_rate);
    }
     void intereset_calculate(){ 
        System.out.println("the interest cak is"+balance*interest_rate);
    }
    void show_balcace(){
        System.out.println(balance); 
    }
    BankAcct(int account_number , double balance){
        this.account_number = account_number;
        this.balance = balance;
    }
    void cal_interest(){
        System.out.println("interest cal for this year " + balance*interest_rate);
        balance = balance+balance*interest_rate;
        // show_interese();
         show_balcace();
    }
      
}
public class Problem_seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter interest rate:");
        BankAcct.interest_rate = sc.nextDouble();
        System.out.println();
        BankAcct acc = new BankAcct(10,1000);
        acc.show_balcace();
        acc.cal_interest();
        acc.chnage_interest(0.15);
        acc.cal_interest();
        sc.close();


    }
}
