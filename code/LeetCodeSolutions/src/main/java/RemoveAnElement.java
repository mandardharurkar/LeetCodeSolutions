public class RemoveAnElement {
    public static void main(String[] args) {
        System.out.println(removeAnElement(new int[]{3,4,5,2}, 3));
    }

    private static int  removeAnElement(int[] nums, int val) {
        if (nums ==null) return -1;
        int i=0;
        for (int n: nums){
            if (n != val){
                nums[i]=n;
                i++;
            }
        }
        return i;
    }
}
