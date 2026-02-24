/*
Write a program that accepts a String and assigns it to another. Check the outcome of
comparison with == and equals() method. Take two Strings and put same input for them. Repeat the
equality checking. Observe the outcome. 
*/
import java.util.Scanner;
class Problem_four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first st ring");
        String s1 = sc.nextLine();
        String s2 = s1;
        System.out.println("s1==s2"+(s1==s2));
        System.out.println("s1.equals (s2"+s1.equals(s2));

        String s3 = new String(sc.nextLine());
        String s4 = new String(sc.nextLine());
        System.out.println("s3==s4"+(s3==s4));
        System.out.println("s3.equals (s4)"+s3.equals(s4));
      sc.close();
    }
}
