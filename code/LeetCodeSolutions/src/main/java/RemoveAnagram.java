import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAnagram {
    public static void main(String[] args) {
        String [] strs = new String[]{"abba" ,"abab","aabb","cd","dc"};
        System.out.println(removeAnagram(strs));
    }

    private static List<String> removeAnagram(String[] strs) {
            List<String> output = new ArrayList<>();
            String prev ="";
            for (String s : strs){
                        char [] chaArr = s.toCharArray();
                Arrays.sort(chaArr);
                 String curr = String.valueOf(chaArr);
                 if (!curr.equals(prev)){
                     output.add(s);
                     prev=curr;
                 }
            }
           return output;
    }
}
