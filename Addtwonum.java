package Gnanmani.java;

import java.util.Scanner;

public class Addtwonum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the fist num");
        int num1 = input.nextInt();
        System.out.println("enter the second num");
        int num2 =input.nextInt();

        int result = num1+num2;
        int sc = num1-num2;
      //  int result = num1/num2;
        System.out.println("add two number:"+ result);
        System.out.println("add two number:"+ sc);
    }
}
