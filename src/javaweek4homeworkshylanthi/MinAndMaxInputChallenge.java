package javaweek4homeworkshylanthi;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {

        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.printMinMax();
    }

    private void printMinMax() {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean empty = true;
        while (true) {
            System.out.println("Enter number:");
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();

                if (empty) {
                    min = temp;
                    max = temp;
                    empty = false;
                }

                if (min > temp) {
                    min = temp;
                }

                if (max < temp) {
                    max = temp;
                }
            } else {
                break;
            }
        }

        scanner.close();

        System.out.println("Min =" + min);
        System.out.println("Max =" + max);
    }

    }