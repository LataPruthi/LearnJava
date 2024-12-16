package CodingQuestions_Practice;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 1538; // Change this number to test other values
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
