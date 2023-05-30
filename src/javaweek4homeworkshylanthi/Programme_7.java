package javaweek4homeworkshylanthi;

public class Programme_7 {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(15));
    }

    public static int sumFirstAndLastDigit(int number) {
        int mod = 0;
        int firstdivide = 0;
        int seconddivide = 0;
        int sum = 0;

        if (number < 0) {
            return -1;
        } else if (number > 0 && number < 10) {
            return number + number;
        } else if (number >= 10 && number < 100) {
            mod = number % 10;
            firstdivide = number / 10;
            sum = mod + firstdivide;

            return sum;
        }

        while (number > 0) {
            mod = number % 10;
            firstdivide = number / 10;
            seconddivide = firstdivide / 10;
            sum = mod + seconddivide;

            break;
        }

        return sum;
}}
