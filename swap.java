package Gnanmani.java;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swapping\n");
        System.out.println("enter value of A: ");
        int a = input.nextInt();
        System.out.println("enter the  of value B: ");
        int b = input.nextInt();

//        int a =5;
//        int b= 45;
//        System.out.println(" value of B: "+a);
//        System.out.println("value of A: "+b);


        int c = a;
        a = b;
        b = c;
        System.out.println("value of A:" + a);
        System.out.println("value of B:" + b);
    }
}
