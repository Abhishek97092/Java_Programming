package Gnanmani.java;

import java.util.Scanner;

public class oddsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number");
        int num = input.nextInt();
        int sum = oddsum(num);
        System.out.println(" odd till  "  +  num  +  " is: " + sum);
    }

    public static int oddsum(int num) {
       int sum = 0;
        int i = 1;
        //int num=0;
        while (i <=num) {
            sum += i;
            i += 2;
        }

        return sum;


    }

}
