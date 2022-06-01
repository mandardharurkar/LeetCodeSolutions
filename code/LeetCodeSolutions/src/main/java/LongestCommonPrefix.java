import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = new String[]{"flower" , "float","flight"};
        System.out.println(longestCommonPrefix(str));
        System.out.println(longestCommonPrefixOther(str));
    }


    private static String longestCommonPrefix(String[] str) {
        if (str == null || str.length ==0){
            return "";
        }
        Arrays.sort(str);
        String first = str[0];
        String last =str[str.length-1];

        int length =0;
        while (length < first.length() && first.charAt(length) == last.charAt(length)){
            length++;
        }
        return first.substring(0,length);
    }
}
