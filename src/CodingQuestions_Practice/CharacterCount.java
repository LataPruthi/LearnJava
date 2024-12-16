package CodingQuestions_Practice;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to count its characters");
        String input= scanner.nextLine();
        int characterCount=input.length();
        System.out.println("The number of characters in given string is "+characterCount);
        scanner.close();

    }
}
