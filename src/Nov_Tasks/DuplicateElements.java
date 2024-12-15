package Nov_Tasks;

import java.util.HashSet;


public class DuplicateElements {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 1, 2, 1, 4, 3};
        HashSet set = new HashSet();
        System.out.println("Duplicate elements are");
        for (int num : numbers) {
            if (set.contains(num)) {
                System.out.println(num + " ");
            } else {
                set.add(num);
            }
        }
    }
}

