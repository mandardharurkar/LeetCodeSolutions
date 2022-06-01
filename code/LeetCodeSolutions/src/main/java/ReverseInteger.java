public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseNumber(123));
    }

    private static long reverseNumber(int num) {
        /**  num = num%10
         *  num = num/10;
         */
        long output=0;
        while (num !=0){

            output =output*10+ num%10;
            num=num/10;
        }
        if(Integer.MIN_VALUE <= output || output <=Integer.MAX_VALUE){
            return output;
        }
        return 0;
    }
}
