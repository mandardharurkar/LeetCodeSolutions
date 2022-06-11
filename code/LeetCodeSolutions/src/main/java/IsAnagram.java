import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("abcd","bdca"));
    }

    private static boolean isAnagram(String s, String t) {
        char [] sChar = s.toCharArray();
        char [] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return String.valueOf(sChar).equals(String.valueOf(tChar));

    }
}
