package Gnanmani.java;

import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to you age calculator");
        System.out.println("pplz enter your age");
        int age =input.nextInt();

        if(age>=65){
            System.out.println("you are siniour peerson");

        }else if(age>=28){
            System.out.println("you are adult");
        }else if(age>=13){
            System.out.println("you are teenager");
        }else {
            System.out.println("you are child");
        }
    }
}
