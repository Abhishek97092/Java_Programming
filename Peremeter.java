package Gnanmani.java;

import java.util.Scanner;

public class Peremeter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("welcome to perimeter calculator");
        System.out.println("pls enter your all 4sides in cms: ");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= sc.nextDouble();

        double perimeter =a+b+c+d;
        System.out.println("perimeter of your rectangle"+perimeter);
    }
}

