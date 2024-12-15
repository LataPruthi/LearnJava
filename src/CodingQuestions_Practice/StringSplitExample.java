package CodingQuestions_Practice;

public class StringSplitExample {
    public static void main(String[] args){
        String input = "you are a great tester. you are great automation tester. you are a full stack tester";
        String[] substrings=input.split("\\.");
        for(int i=0;i<substrings.length;i++){
            System.out.println("string s" + (i+1) +": "+substrings[i]);
        }
    }
}
