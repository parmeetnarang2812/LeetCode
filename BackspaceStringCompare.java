/*                      844. Backspace String Compare - Easy

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

Example 1:
    Input: s = "ab#c", t = "ad#c"
    Output: true
    Explanation: Both s and t become "ac".

Example 2:
    Input: s = "ab##", t = "c#d#"
    Output: true
    Explanation: Both s and t become "".

Example 3:
    Input: s = "a#c", t = "b"
    Output: false
    Explanation: s becomes "c" while t becomes "b".
 
Constraints:
    1 <= s.length, t.length <= 200
    s and t only contain lowercase letters and '#' characters.
*/

/* my leetcode soln
// StringBuilder Solution
// Runtime: 0 ms, runtime beats 100.00 % of java submissions
// Memory Usage: 34.3 MB

    public boolean backspaceCompare(String S, String T) {
        return sb(S).equals(sb(T));
    }
    
    private String sb(String str) {
        StringBuilder sbr = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            
            if (c != '#') {
                sbr.append(c);
            } else if (sbr.length() != 0) {
                sbr.deleteCharAt(sbr.length() - 1);
            }
        }
        return sbr.toString();
    }

// Stack Solution
// Runtime: 2 ms, faster than 49.13% of Java online submissions
// Memory Usage: 35.8 MB, less than 72.73% of Java online submissions

    public boolean backspaceCompare(String S, String T) {
        return stackSolution(S).equals(stackSolution(T));
    }
    
    private String stackSolution(String str) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : str.toCharArray()) {
		
            if (c != '#') {
                stack.push(c);
				
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack.toString();
    } 
*/