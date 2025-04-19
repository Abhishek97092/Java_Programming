package Gnanmani.java;

import java.util.Scanner;

public class leftshiftoperator {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
         //   System.out.println("showing the left shift operator");
            System.out.println("showing the right shift operator");
            System.out.println("enter the first number");
            int num = sc.nextInt();


          //  int result = num << 5;
            int result = num >> 10;
            System.out.println("result is :" + result);

        }
    }
}
