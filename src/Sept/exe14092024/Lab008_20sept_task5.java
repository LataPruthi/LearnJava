package Sept.exe14092024;

import java.util.Scanner;

public class Lab008_20sept_task5 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int year =sc.nextInt();

        if ((year%4 ==0 && year%100 !=0) || year%400==0)
        {
            System.out.println(year + " : Leap year");
        }
        else
        {
            System.out.println(year + " : Non leap year");
        }
    }
}
