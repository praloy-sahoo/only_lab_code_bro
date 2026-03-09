// write a program that accepts radius of a circle and displays area of the circle . overload the constructor to accept radius
// radius  as input and another circle object as input then show the effect of the shallow vs deep copy of objects
// declare a cosnat  pi equals to 3.14 using oop concept

import java.util.Scanner;
class Circle{
    double radious ;
    final double pI =3.14;
    Circle(){
        radious = 0;
    }
    Circle(double r){
        radious = r;
    }

    Circle(Circle c ){
        this.radious = c.radious;
    }
    double area(){
        return pI*radious*radious;
    }
}   
 class Problem_two{
    public static void main(String[] args) {
    System.out.println(("enter the radious "));
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    Circle c1 = new Circle(r);
    System.out.println(c1.area());
     Circle c2 = c1;
     Circle c3 = new Circle(c1);
     System.out.println("before modifying area c1"+c1.area());
     System.out.println("before modifying area c2"+c2.area());
     System.out.println("before modifying area c3"+c3.area());
     c1.radious = 20;
     System.out.println("after modifying area c1"+c1.area());
     System.out.println("after modifying area c2"+c2.area());
     System.out.println("after modifying area c3"+c3.area());
    }
}
