package Gnanmani.java;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to factorial");
        System.out.println("enter your first number");
        int num =input.nextInt();
        long fact= Factorial(num) ;


        System.out.println("Factorial is :"+fact);

    }
    public static long Factorial (int num ){
        if(num<2){
            return 1;
        }

        long fact =1;
        int i=2;
        while (i<=num){
            fact*=i;
            i++;
        }
        return fact;
    }

}

