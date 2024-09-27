package Sept.exe14092024;

import java.util.Scanner;

public class Lab009_23sept_task1 {
    public static void main(String[] args) {

        double num1 = 10;

        double num2 = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                System.out.println("result:"+" "+(num1+num2));
                break;

            case '-':
                System.out.println("result:"+" "+(num1 -num2));
                break;

            case '*':
                System.out.println("result:"+" "+(num1 * num2));
                break;


            case '/':
                System.out.println("result:"+" "+(num1 / num2));
                break;

            default:
                System.out.println("invalid input");

        }



    }
}
