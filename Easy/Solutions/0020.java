import java.util.Stack;

class Solution {
    /**
     * Checks if a given string of brackets is valid.
     *
     * A string is valid if:
     * - Every opening bracket has a corresponding closing bracket.
     * - Brackets are closed in the correct order.
     *
     * @param s The input string containing brackets.
     * @return  True if the string is valid, otherwise false.
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If closing bracket, check if it matches the last opened bracket
            else {
                if (stack.isEmpty()) return false; // No matching opening bracket
                char last = stack.pop();
                if ((c == ')' && last != '(') ||
                    (c == '}' && last != '{') ||
                    (c == ']' && last != '[')) {
                    return false; // Mismatched pair
                }
            }
        }
        
        return stack.isEmpty(); // Valid if stack is empty (all pairs matched)
    }
}
