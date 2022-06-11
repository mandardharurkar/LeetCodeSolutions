import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
     String [] str = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(str));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs){
            char [] charArr = str.toCharArray();
            Arrays.sort(charArr);
                String key = String.valueOf(charArr);
                if (!map.containsKey(key)){
                    map.put(key, new ArrayList<String>());
                }
                map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
