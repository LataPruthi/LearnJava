package Sept.exe14092024;

import java.util.Scanner;

public class Lab013_25sept_task2 {
    public static void main(String[] args) {
        //Task to find factorial of input number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int fact =1;
        for (int i=1;i<=n;i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
