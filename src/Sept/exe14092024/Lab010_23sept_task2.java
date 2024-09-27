package Sept.exe14092024;

import java.util.Scanner;

public class Lab010_23sept_task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("choose an month no in 1-12: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("JAN");
                break;

            case 2:
                System.out.println("FEB");
                break;

            case 3:
                System.out.println("MAR");
                break;


            case 4:
                System.out.println("APR");
                break;

            case 5:
                System.out.println("MAY");
                break;

            case 6:
                System.out.println("JUNE");
                break;

            case 7:
                System.out.println("JULY");
                break;


            case 8:
                System.out.println("Aug");
                break;


            case 9:
                System.out.println("Sept");
                break;

            case 10:
                System.out.println("oct");
                break;

            case 11:
                System.out.println("nov");
                break;

            case 12:
                System.out.println("Dec");
                break;

            default:
                System.out.println("invalid input");

        }


    }
}
