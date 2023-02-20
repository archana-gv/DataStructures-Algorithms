import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

        String str = "([])(){}(())()()";
        Boolean result = balancedBrackets(str);
        System.out.println(result);
    }

    public static boolean balancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '(':
                    stack.push(')'); break;
                case '[':
                    stack.push(']');break;
                case '{':
                    stack.push('}');break;
                default:
                    if (c != ')' && c != ']' && c != '}') break;
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != c) return false;

            }
        }
        return stack.isEmpty();
    }
}