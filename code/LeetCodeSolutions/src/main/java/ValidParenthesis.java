import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(validParenthesis("{}[]()"));
        System.out.println(validParenthesis("{}]()"));
    }

    private static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c: s.toCharArray()){
            if ( c =='(' || c =='[' || c =='{' ) stack.push(c);
            else if (stack.isEmpty()) return false;
            else if( c == ')' && stack.pop() != '(') return false;
            else if( c == ']' && stack.pop() != '[') return false;
            else if( c == '}' && stack.pop() != '{') return false;
        }
        return stack.isEmpty();
    }
}
