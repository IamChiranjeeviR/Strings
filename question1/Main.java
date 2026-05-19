
public class Main {
    public static void main(String[] args) {
        // String str = "((()))";
        String str = "()(()())(())";
        System.out.println(removeOutermostParentheses(str));
    }

    public static String removeOutermostParentheses(String str) {
        StringBuilder result = new StringBuilder();
        int level = 0;
        
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                if (level > 0)
                    result.append(ch);
                level++;
            }
            else if (ch == ')') {
                level--;
                if (level > 0)
                    result.append(ch);
            }
        }

        return result.toString();
    } 

}