package Sept.exe14092024;

public class Lab004_20sept_task1 {

    public static void main(String[] args) {


        int a=10;
        int b=20;
        int c=45;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }
}
