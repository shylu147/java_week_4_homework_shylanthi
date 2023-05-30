package javaweek4homeworkshylanthi;

import java.util.Scanner;

public class Programme_6 {
    public static void main(String[] args)

    {
        int i,j,n;
        System.out.print("Input number of rows : ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
