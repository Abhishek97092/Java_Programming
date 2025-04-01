package Gnanmani.java;

import java.util.Scanner;

public class Simpleinterest {

    public static void main(String[] args) {



        Scanner input =new Scanner(System.in);
        System.out.println("enter the principle compound interest:");
        int principle =input.nextInt();
        System.out.println("enter the  rate compound interest:");
        int rate =input.nextInt();

        System.out.println("enter the  time compound interest:");
        int years =input.nextInt();

       // int compoundinterest = principle*(1+rate/100)*years;
        int compoundinterst = (principle*rate*years)/100;

        System.out.println("value is compound interest is:"+compoundinterst);


    }
}
