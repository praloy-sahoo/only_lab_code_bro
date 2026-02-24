/*
Write a program where class contains void show(int) to display the argument passed. Call the
function once with short as actual parameter and again double as actual parameter. Add another
function as void show(double) . Repeat the calls. Observe the outcomes in each case.
*/
import java.util.Scanner;
public class Problem_five {
    static void show(int x){
        System.out.println(x);
    }
    static  void  show(double x){
        System.out.println(x);
    }
    
  public static void main(String[] args) {
    show((short)5);
    show((double)5);
  }
}
