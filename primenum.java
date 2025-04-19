package Gnanmani.java;

import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("wel come to prime num checker");
        System.out.println("plz enter your num");
        int num =input.nextInt();
        boolean isprime =isprime(num);
        System.out.println("your num is:"+isprime);

    }
    public static boolean isprime(int num){
        int i =2;
        while (i<num){
            if(num % i==0){
                return false;
            }
            i++;
        }
        return true;

    }
}
