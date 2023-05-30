package javaweek4homeworkshylanthi;

import java.util.Scanner;

public class Programme_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Please Provide single character from the alphabet: ");
        String letter = s.next();

        if (!letter.matches("[A-Za-z]")) {
            System.out.println("Error");
        } else {
            letter = letter.toLowerCase();
            if (letter.matches("[aeiou]")) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}
