package CodingQuestions_Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMinMax {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,89,34,56,44);
        int max= Collections.max(numbers);
        int min=Collections.min(numbers);
        System.out.println("List is" + numbers);
        System.out.println("Maximum value is "+ max);
        System.out.println("Minimum value is "+ min);


    }
}
