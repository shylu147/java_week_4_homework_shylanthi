package javaweek4homeworkshylanthi;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while(count <= 10) {
            System.out.println("Enter number #" + count);

            boolean validateNumber = s.hasNextInt();
            if(validateNumber) {
                int number = s.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid number");
            }
            // Always return new userInput
            s.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum);

        s.close();
    }


}


