package CodingQuestions_Practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        aList.add("four");
        aList.add("five");
        aList.add("six");
        ListIterator<String> li =aList.listIterator(); {
            while(li.hasNext())

            {
                li.next();
            }
            System.out.println("ArrayList elements in the reverse order are");
            while(li.hasPrevious()){
                System.out.println(li.previous());
        }


    }


    }
}
