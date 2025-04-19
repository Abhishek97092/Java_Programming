package Gnanmani.java;

import java.util.Scanner;

public class XoR {
    //public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("showing the Bitwise  xor opertors");
//        System.out.println("enter the first number");
//        int a = sc.nextInt();
//        System.out.println("enter the second number");
//        int b = sc.nextInt();
//
//        int result = a | b;
//        System.out.println("result is :" + result);
//


        //bitwise compliment:
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("showing the Bitwise  compliment");
            System.out.println("enter the first number");
            int num= sc.nextInt();


            int result = ~num;
            System.out.println("result is :"+result);



        }
}