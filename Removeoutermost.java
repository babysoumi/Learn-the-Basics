public class Removeoutermost {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int Count = 0; 
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (Count > 0) {
                    result.append(ch);
                }
                Count++;
            } else if (ch == ')') {
                Count--;
                if (Count > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}
