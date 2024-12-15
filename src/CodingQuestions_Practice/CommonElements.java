package CodingQuestions_Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5,6};
        int[] arr2={2,4,9};

        System.out.println("common elements are:" + findCommonElements(arr1,arr2));

    }

    public static ArrayList<Integer> findCommonElements(int[] arr1,int[] arr2){

        HashSet<Integer> set =new HashSet<>();
        for(int num :arr1){
            set.add(num);
        }
        ArrayList<Integer> commonElements =new ArrayList<>();
        for(int num :arr2){
            if(set.contains(num)){
                commonElements.add(num);
                set.remove(num);
            }
        }
        return commonElements;
    }
}
