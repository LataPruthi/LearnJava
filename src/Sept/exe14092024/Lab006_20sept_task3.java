package Sept.exe14092024;

import java.util.Scanner;

public class Lab006_20sept_task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three side lengths of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b && a==c && b==c)
        {
            System.out.println("All sides are equal");
        }
        else if (a==b || a==c || b==c)
        {
            System.out.println("Two sides are equal");
        }
        else
        {
            System.out.println("no sides are equal");
        }
    }
}
