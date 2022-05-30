import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        /**
         * Algorithm
         * We are given an array of numbers. Given an index, this array returns a number in O(1) time.
         * However, we want something different. We would rather have a data structure that, when provided a value, gives us the index in O(1) time. HashMap to the rescue!
         * Create a HashMap. As we loop through the array, populate the HashMap with each number, where the HashMap "key" is the number, and the HashMap "value" is the index of the number in the array.
         * For each number, we check our HashMap to see if the complement exists in it. If so, we've found a pair of numbers that create our solution.
         * Implementation Detail: First check the HashMap for the complement before putting the current number in it.
         */
        int []nums = new int []{2,7,11,15};int  target = 9;
       int [] output= twoSum(nums,target);
        System.out.println("output="+ output[0] + ", "+ output[1]);
    }

    private static int [] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;map.put(nums[i],i++)){
            if (map.containsKey(target -nums[i])){
                return new int []{map.get(target-nums[i]),i};
            }
        }
        return new int []{-1,-1};
    }
}
