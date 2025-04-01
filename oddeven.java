package Gnanmani.java;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("welcome to odd even number :");
        System.out.println("please enter your number ");
        int num =input.nextInt();

        if (num % 2 == 0) {
            System.out.println("enter your even number");
        }else {
            System.out.println("enter your odd number");
        }

    }
}
