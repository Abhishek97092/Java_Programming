package Gnanmani.java;

import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("wel come to fibonacci sseries");
        System.out.println("please enter your number");
        int num =input.nextInt();
        System.out.println("here is the fibonacci series:");
        printfibonacci(num);
    }
    public static void printfibonacci(int num){
        if(num<0)return;
        System.out.println("0");
        if(num == 0)return;
        int first =0,second=1;
        while (first+second<=num){
            int third =first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }

    }
}
