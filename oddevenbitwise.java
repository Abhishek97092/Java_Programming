package Gnanmani.java;

import java.util.Scanner;

public class oddevenbitwise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd even bitwise");
        System.out.println("enter your number");
        int num =input.nextInt();

        if((num & 1) ==1){
            System.out.println("your number is odd:");
        }else {
            System.out.println("your number is even");
        }
    }
}