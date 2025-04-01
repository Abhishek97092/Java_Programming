package Gnanmani.java;

import java.util.Scanner;

public class Bitwiswcompliment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("perform the bitwise complment");
        System.out.println("enter the first number");
        int a = sc.nextInt();
//        System.out.println("enter the second number");
//        int b =sc.nextInt();

        int result =~a;
        System.out.println("result is"+result);
    }
}
