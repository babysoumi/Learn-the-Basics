public class Removeoutermost {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int openCount = 0; 
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (openCount > 0) {
                    result.append(ch);
                }
                openCount++;
            } else if (ch == ')') {
                openCount--;
                if (openCount > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}
