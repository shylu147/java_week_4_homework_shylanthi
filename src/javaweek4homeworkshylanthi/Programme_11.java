package javaweek4homeworkshylanthi;

import java.util.Scanner;

public class Programme_11 {

    public static void main(String[] args) {

        System.out.println("Even sum: " + getEvenDigitSum(456));

    }

    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }

        int digit;
        int sum = 0;

        while(number > 0) {
            digit = number % 10;

            if(isEven(digit)) {
                sum += digit;
            }

            number /= 10;
        }

        return sum;

    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

}

