package javaweek4homeworkshylanthi;

public class DigitSumChallenge {

    public static int sumDigits (int num) {
        int sum = 0;

        if(num == 10) return 1;

        if(num > 10) {
            sum += num % 10;
            while((num = num / 10) >= 1) {
                sum += (num > 10) ? num%10 : num;
            }
        } else {
            sum += num;
        }
        return sum;}

    public static void main(String[] args) {
           sumDigits(5);
    }

}

