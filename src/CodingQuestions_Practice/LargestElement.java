package CodingQuestions_Practice;

public class LargestElement {
    public static void main(String[] args){
        int[] array={1,10,12,25,4,3};
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println("largest element is " + max);
    }

}
