package javaweek4homeworkshylanthi;

import java.util.Scanner;

public class Programme_15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        printLeftTriange(5);

    }

    public static void printLeftTriange(int a) {

        for (int i=0; i<a+1 ; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
