package Gnanmani.java;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner result =new Scanner(System.in);
        System.out.println("Welcomee to Lcm");
        System.out.println("enter your number:");
        int first = result.nextInt();
        System.out.println("entr you number:");
        int  second = result.nextInt();
        int lcm =lcm(first,second);
        System.out.println("Lcm of two number is :"+lcm);
    }
    public static int lcm(int first , int secoond) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % secoond == 0) {
                return factor;
            }
            i++;
        }
    }



}
