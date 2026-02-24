// write a program  to accept two short integers  from user and display the sum
// check what happens when sum exceeds the maximun range of short
// praloy sahoo 
// 
import java.util.Scanner;


 public class problem_one{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the first  number:");
      short number_1 = sc.nextShort();
      System.out.println("enter the second  number:");
      short number_2 = sc.nextShort();
      short sum = (short)(number_1+number_2);
      System.out.println("sum is"+sum);
      sc.close();
    }
}
