package Gnanmani.java;

import java.util.Scanner;

public class BitwiseAnD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("noe showing the bitwiseand operators");
        System.out.println("enter the first number");
        int first = sc.nextInt();
        System.out.println("enter the second number");
        int second = sc.nextInt();

        int result = first & second;
        System.out.println("show the bitwise and opertors" + result);
    }
}
