/*
6. Create a program for ordering Pizza. The user should mention the size of the Pizza and the
toppings he/she wants. A user may ask for any toppings. Implement this using (i) variable arguments
concept and (ii) command line arguments.
*/
import java.util.Scanner;
  class pizza_args{
    String size ;
      void get_all_topping(String size, String...toppings){
        System.out.println("pizz size"+size);
        for( String m : toppings){
            System.out.println("the topping are:"+m);
        }
     }
     pizza_args(String... x){
        size = x[0];
        System.out.println("pizza size"+size);
        System.out.println("the topping are");
        for(int i =1;i<x.length;i++){
            System.out.println(x[i]);
        }
     }
     
  }
  
 class Problem_six {
   public static void main(String[] args) {
    // pizza_args p = new pizza_args();
    //  p.get_all_topping("medium","onion","barbeque","cheese");
    //  p.get_all_topping("medium","onion","barbeque");
     pizza_args p2 = new pizza_args(args);
     
   }    
   
}
