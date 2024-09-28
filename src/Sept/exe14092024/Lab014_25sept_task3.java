package Sept.exe14092024;

import java.util.Scanner;

public class Lab014_25sept_task3 {
    public static void main(String[] args) {
        //task to print vowels and consonants in string
        String str = "Pramod";
        int vowels = 0, consonants = 0;

        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }
}

