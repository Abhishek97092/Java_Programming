package Gnanmani.java;

public class pattern {
    //public class SimplePattern {
        public static void main(String[] args) {
            int rows = 5; // you can change the number of rows

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }


