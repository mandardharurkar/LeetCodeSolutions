public class MinPathSum {
    public static void main(String[] args) {
        int [][] nums = new int[][]{{1,3,1},{1,5,1}};
        int sum = getMinSum(nums,nums.length-1,nums[0].length-1);
        System.out.println("sum="+ sum);
        int sumDp = getMinSumDP(nums,nums.length-1,nums[0].length-1);
        System.out.println("sumDp="+ sumDp);

    }

    private static int getMinSumDP(int[][] nums, int m, int n) {
        int [][] K = new int[m+1][n+1];

        K[0][0] = nums[0][0];

        for (int i=1;i< m;i++){
            K[i][0] = K[i-1][0]+ nums[i-1][0];
        }

        for (int j=1;j< n;j++){
            K[0][j] = K[0][j-1]+ nums[0][j];
        }

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                K[i][j]= Math.min(K[i][j-1] ,K[i-1][j]) + nums[i][j];
            }
        }
        return K[m-1][n-1];

     }

    private static int getMinSum(int[][] nums, int m, int n) {
        if(m<0 || n<0)
            return Integer.MAX_VALUE;
        if (m ==0 && n ==0){
             return nums[0][0];
        }
        return nums[m][n]+ Math.min(getMinSum(nums,m-1,n) ,getMinSum(nums,m,n-1));
    }


}
