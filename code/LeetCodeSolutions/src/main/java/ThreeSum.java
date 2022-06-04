import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> sumList = getThreeSumList(new int[]{-1,0,1,-1,2,4});
        System.out.println(sumList);
    }

    private static List<List<Integer>> getThreeSumList(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++){
              if(i==0 ||(i>0 &&nums[i] !=nums[i-1])){
                  int low = i+1;
                  int high =nums.length-1;
                  int sum = 0- nums[i];
                  while (low <high){
                      if (nums[low]+ nums[high] == sum){
                          output.add(Arrays.asList(nums[i],nums[low],nums[high]));
                          low++;
                          high--;
                      }else if (nums[low]+ nums[high]> sum){
                            high--;
                      }else {low++;}
              }
        }
    }
        return output;
     }
}
