package Day9;

 import java.util.Stack;
public class CheckParanthesisValidOrNot {
    String str = "({[]})";
    boolean isValid() {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if(ch == ')' || ch == '}' || ch == ']') {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        CheckParanthesisValidOrNot obj = new CheckParanthesisValidOrNot();
        System.out.println(obj.isValid());
    }
}
