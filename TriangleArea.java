package Gnanmani.java;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Triangle of area");
        System.out.println("pls enter your base cms:");
        double base= sc.nextDouble();
        System.out.println("now enter the perpendicular in cms:");
        double height =sc.nextDouble();

       // double area = 0.5*base*height;
        double area =(base*height)/2;
        System.out.println("the area of triangle is:"+area);

    }
}
