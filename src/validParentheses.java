import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        System.out.println(solution("[]])"));
    }

    static boolean solution(String S) {
        //more closing
        //more opening
        //invalid ordering
        Stack<Character> stack = new Stack<>();
        char top;

        for (char c : S.toCharArray()) {
            if (c=='(' || c=='[' || c=='{') stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                top = stack.pop();
                if (top == '(' && c != ')') return false;
                if (top == '[' && c != ']') return false;
                if (top == '{' && c != '}') return false;
            }
        }
        return stack.isEmpty();
    }
}

