package Gnanmani.java;

import java.util.Scanner;

public class postivenegtivezero {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("we,come to number cheacker ");
        System.out.println("please enter your number:");
        int num =input.nextInt();

        if(num>0) {
            System.out.println("your number is ppostive");
        }else if(num ==0) {
            System.out.println("your number is zero");
        }else{
            System.out.println("your is negtive");
        }
    }
}
