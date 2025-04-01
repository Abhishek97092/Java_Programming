package Gnanmani.java;

import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        System.out.println("welcome to gratest number");
//        System.out.println("enter  the first your number");
//        int num1 =input.nextInt();
//        System.out.println("enter  the second your number");
//        int num2 =input.nextInt();
//        System.out.println("enter  the third your number");
//        int num3 =input.nextInt();
//
//
//        if(num1 >= num2 && num1>=num3) {
//            System.out.println(num1 + "is the greatest number");
//            // }else if (num2>=num1 && num2>=num3){
//        }else if (num2>=num3) {
//            System.out.println(num2 + "is the gratest number");
//        }else {
//            System.out.println(num3+"is the greatst number");


            Scanner scanner= new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            System.out.print("Enter third number: ");
            int num3 = scanner.nextInt();

            // Find the greatest number
            int greatest = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);

            // Display the result
            System.out.println("The greatest number is: " + greatest);

            scanner.close();

        }
    }

