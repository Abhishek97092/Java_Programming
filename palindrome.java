package Gnanmani.java;

import java.util.Scanner;

public class palindrome {
  //  public class PalindromeSimple {
        public static void main(String[] args) {
            int num = 121; // you can change this number
            int original = num, reversed = 0;

            while (num > 0) {
                reversed = reversed * 10 + num % 10;
                num /= 10;
            }

            if (original == reversed)
                System.out.println(original + " is a palindrome.");
            else
                System.out.println(original + " is not a palindrome.");
        }
    }





