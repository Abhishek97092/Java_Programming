package Gnanmani.java;

import java.util.Scanner;

public class sumdigit {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("wel come to sum digit number");
        System.out.println("please enter your  num");
        int num =input.nextInt();
        int sum =sumdigit(num);
        System.out.println("sum of digit is:"+sum);

    }
    public static int sumdigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;

    }

}
