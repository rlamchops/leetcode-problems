package easy;
//#20
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int a = 0; a < s.length(); a++) {
            char curr = s.charAt(a);
            if ("([{".contains("" + curr)) {
                stack.push(s.charAt(a));
            }
            else if (")]}".contains("" + curr)) {
                char check = stack.peek();
                switch (check) {
                    case '{':
                        if (curr != '}') {
                            return false;
                        }
                        break;
                    case '[':
                        if (curr != ']') {
                            return false;
                        }
                        break;
                    case '(':
                        if (curr != ')') {
                            return false;
                        }
                        break;
                }
                stack.pop();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String one = "()";
        String two = "()[]{}";
        String three = "(]";
        String four = "([])";

        System.out.println(isValid(one));
        System.out.println(isValid(two));
        System.out.println(isValid(three));
        System.out.println(isValid(four));
    }
}
