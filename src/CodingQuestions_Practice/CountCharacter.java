package CodingQuestions_Practice;
import java.util.Scanner;

    public class CountCharacter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input string
            System.out.print("Enter the string: ");
            String input = scanner.nextLine();

            // Variables to store the output
            StringBuilder output = new StringBuilder();

            // Processing input string
            int count = 1; // To count consecutive characters
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == input.charAt(i - 1)) {
                    count++; // Increment count if character is the same as the previous
                } else {
                    output.append(input.charAt(i - 1)).append(count); // Append character and count
                    count = 1; // Reset count
                }
            }

            // Append the last character and its count
            output.append(input.charAt(input.length() - 1)).append(count);

            // Print the output
            System.out.println("Output: " + output);
        }
    }

