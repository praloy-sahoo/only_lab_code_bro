/*
Consider a wrapper class for a numeric basic type. Check the support for the following: conversion
from i) basic type to object ii) object to basic type iii) basic type to String iv) String (holding numeric
data) to numeric object v) object to String.
*/

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // i) Basic type → Object (Autoboxing)
        System.out.print("Enter an integer (primitive): ");
        int a = sc.nextInt();
        Integer obj1 = a;   
        System.out.println("Basic to Object: " + obj1);

        // ii) Object → Basic type (Unboxing)
        int b = obj1;       
        System.out.println("Object to Basic: " + b);

        // iii) Basic type → String
        String s1 = Integer.toString(a);
        System.out.println("Basic to String: " + s1);

        // iv) String → Numeric Object
        System.out.print("Enter a numeric string: ");
        String s2 = sc.next();
        Integer obj2 = Integer.valueOf(s2);
        System.out.println("String to Object: " + obj2);

        // v) Object → String
        String s3 = obj2.toString();
        System.out.println("Object to String: " + s3);

        sc.close();
    }
}