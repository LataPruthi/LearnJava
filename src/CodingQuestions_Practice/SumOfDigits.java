package CodingQuestions_Practice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Enter the integer to find sum of its digit ");
        Scanner scanner =new Scanner(System.in);
        int number=scanner.nextInt();
        int sum=0;
        int originalNumber=number;
        while (number != 0) {
       sum+=number%10;
       number/=10;

        }

        System.out.println("the sum of the digits of "+originalNumber + " is " + sum);
        scanner.close();
    }
}
