package javaweek4homeworkshylanthi;

import java.util.Scanner;

public class Programme_9 {
    public static void main(String[] args) {

        int count, num1 = 0, num2 = 1;
        System.out.println("How may numbers you want in the sequence:");
        Scanner s = new Scanner(System.in);
        count = s.nextInt();
        s.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
