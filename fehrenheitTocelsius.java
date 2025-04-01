package Gnanmani.java;

import java.util.Scanner;

public class fehrenheitTocelsius {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to Temperature converter");
        System.out.println("Enter your temperature i  F:");
        float fah =input.nextFloat();
        Float cel =(fah -32)*5/9;
        System.out.println("your tepperature is:"+cel+"c");
    }
}
