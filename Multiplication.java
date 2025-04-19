package Gnanmani.java;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("welcome to multiplication");
        System.out.println("enter your number ");
        int num =scanner.nextInt();
        printmultiplication(num);

    }
    public static void printmultiplication(int num) {
        int i=1;
        while(i<=10){
            System.out.println(num+" X "+i+"="+(num*i));
            i++;
        }
    }
}


