package Gnanmani.java;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("welcome to grade calculater");
        System.out.println("plz enter your percentage:");
        float percentage =input.nextFloat();

        if (percentage>=90){
            System.out.println("great,you have got A");
        }else if(percentage>=75){
            System.out.println("Good,you have got B");

        }else if(percentage>=60){
            System.out.println("you have got c ,work hard next time ");

        }else if(percentage>=30){
            System.out.println("you have got D ,you seriosily need to work");
        }else {
            System.out.println("sorry you got faild marks");
        }
    }
}
