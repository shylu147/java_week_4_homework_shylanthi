package javaweek4homeworkshylanthi;

import java.util.Scanner;

public class Programme_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Right Angled Triangle Pattern Rows = ");
        int rows = s.nextInt();

        System.out.println("Printing Right Angled Triangle @ Pattern");

        for (int i = 1 ; i <= rows; i++ )
        {
            for (int j = 1 ; j <= i; j++ )
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
