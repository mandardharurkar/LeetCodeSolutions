public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1 [] = new int []{ 1,3};
        int arr2[] = new int [] {2};
        double median = findMedianSortedArrays(arr1,arr2);
        System.out.println("Median="+ median);

    }

    public static double findMedianSortedArrays(int[] a, int[] b) {
        int length = a.length + b.length;

        int current =0;
        int previous =0;

        int aIndex =0;
        int bIndex =0;
        int resultIndex=0;

        while(resultIndex ++ <= (length /2) ){
            previous =current;

            if(aIndex >= a.length){
                current = b[bIndex++];
                continue;
            }
            if(bIndex >= b.length){
                current = a[aIndex++];
                continue;
            }

            if(a[aIndex] <b[bIndex]){
                current = a[aIndex++];
            }else{
                current = b[bIndex++];
            }
        }

        if(length %2 ==0){
            return (double) (current+ previous) /2;
        }else{
            return  (double) current;
        }

    }

    private static double medianOfSortedArray(int[] input1, int[] input2) {
        if (input1 == null || input2 == null) {
            throw new IllegalArgumentException();
        } else if (input1.length > input2.length) {
            return medianOfSortedArray(input2, input1); // ensures 1st array is smaller than 2nd array
        }
        int x = input1.length;
        int y = input2.length;

        int low = 0;
        int high = x;
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxLeftX  = (partitionX == 0) ? Integer.MIN_VALUE : input1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : input1[partitionX];

            int maxLeftY  = (partitionY == 0) ? Integer.MIN_VALUE : input2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : input2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }

        throw new IllegalArgumentException(); // can only occur if input arrays were not sorted.
    }
}
