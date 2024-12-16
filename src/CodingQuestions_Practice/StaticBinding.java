package CodingQuestions_Practice;

public class StaticBinding {

    void print() {
        System.out.println("Printing the statement");
    }


    public static void main(String[] args) {
        StaticBinding sb = new StaticBinding();
        sb.print();
    }
}