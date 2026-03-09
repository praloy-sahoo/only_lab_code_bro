/*
Take a String input that contains multiple words. Do the following: i) number of times ‘a’ appears ii)
number of times “and” appears iii) whether it starts with “The” or not iv) put the String into an
array of characters v) display the tokens in the String (tokens are the substrings separated by space

or @ or .) vi)Find the largest palindrome in a given input sentence after removing any non-
alphanumeric character.
*/


import java.util.*;

public class Ques7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        /* i) Number of times 'a' appears */
        int countA = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                countA++;
            }
        }
        System.out.println("Number of times 'a' appears: " + countA);

        /* ii) Number of times \"and\" appears */
        int countAnd = 0;
        String[] words = input.toLowerCase().split("\\s+");
        for (String w : words) {
            if (w.equals("and")) {
                countAnd++;
            }
        }
        System.out.println("Number of times \"and\" appears: " + countAnd);

        /* iii) Whether it starts with \"The\" */
        if (input.startsWith("The")) {
            System.out.println("String starts with \"The\"");
        } else {
            System.out.println("String does not start with \"The\"");
        }

        /* iv) Put the String into an array of characters */
        char[] charArray = input.toCharArray();
        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        /* v) Display tokens (separated by space or @ or .) */
        String[] tokens = input.split("[ @.]");
        System.out.println("Tokens:");
        for (String t : tokens) {
            if (!t.isEmpty()) {
                System.out.println(t);
            }
        }

        /* vi) Largest palindrome after removing non-alphanumeric characters */
        String cleaned = input.replaceAll("[^a-zA-Z0-9 ]", "");
        String[] palWords = cleaned.split("\\s+");

        String largestPalindrome = "";

        for (String w : palWords) {
            String rev = new StringBuilder(w).reverse().toString();
            if (w.equalsIgnoreCase(rev) && w.length() > largestPalindrome.length()) {
                largestPalindrome = w;
            }
        }

        if (!largestPalindrome.isEmpty()) {
            System.out.println("Largest palindrome: " + largestPalindrome);
        } else {
            System.out.println("No palindrome found");
        }

        sc.close();
    }
}