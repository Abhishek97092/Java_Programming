package Gnanmani.java;

import java.util.Scanner;

import static java.lang.Integer.reverse;

public class reversedigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter  your number");
        int num =input.nextInt();
        int reverse =reverse(num);
        System.out.println("your number is:"+reverse);

    }
    public static int reverse(int num){
        int newnum=0;
        while (num>0){
            int digit =num %10;
             newnum  = newnum*10+digit;
             num/=10;
        }
        return newnum;
    }
}
