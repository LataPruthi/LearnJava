package CodingQuestions_Practice;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args){
        int[] nums={10,20,30,40,70,69};
        Arrays.sort(nums);
        System.out.println("Second largest:" + nums[nums.length-2]);
    }
}
