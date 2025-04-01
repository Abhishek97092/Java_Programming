package Gnanmani.java;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to enter new year calculator");
        System.out.println("please enter the number leap year ");
        int year =input.nextInt();

        if (year % 400 ==0){
            System.out.println("your year is leap year");

        }
        else if(year % 100 == 0){
            System.out.println("your year us not leap year");
        }
        else if (year % 4 ==0){
            System.out.println("your year is leap year");
        }
        else {
            System.out.println("your year us not leap year");
        }


    }
}
