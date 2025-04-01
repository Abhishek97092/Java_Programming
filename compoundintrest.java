package Gnanmani.java;

import java.util.Scanner;

public class compoundintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to the compound interest");
        System.out.println("enter the compound interest ");
        int principle =sc.nextInt();
        System.out.println("enter the rate compound interest");
        int rate=sc.nextInt();
        System.out.println("enter the year compound interest");
        int year =sc.nextInt();

       int  compoundintrest = principle*(1+rate/100)* year;
        System.out.println("value of comppount interest:"+compoundintrest);
    }
}
