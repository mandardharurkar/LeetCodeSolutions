 public class RemoveElement {
     public static void main(String[] args) {
         System.out.println(removeDuplicates(new int []{1,2,2,3,4}));
     }

     private static int removeDuplicates(int[] nums) {
         int prev =0;
         for (int current=1;current <nums.length;current++){
             if(nums[prev]!=nums[current]){
                 prev++;
                 nums[prev]=nums[current];
             }
         }
     return prev+1;
     }
 }
