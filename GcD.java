package Gnanmani.java;

import java.util.Scanner;

public class GcD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to gcd");
        System.out.println("enter the firdt number:");
        int first = input.nextInt();
        System.out.println("enter the second nuumber:");
        int second = input.nextInt();
        int gcd = gcd(first,second);
        System.out.println("gcd is number:" + gcd);

    }

    public static int gcd(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);

        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
    }
