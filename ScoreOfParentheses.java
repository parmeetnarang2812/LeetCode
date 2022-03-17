/*                      856. Score of Parentheses - Medium

Given a balanced parentheses string s, return the score of the string.
The score of a balanced parentheses string is based on the following rule:
    "()" has score 1.
    AB has score A + B, where A and B are balanced parentheses strings.
    (A) has score 2 * A, where A is a balanced parentheses string.
 
Example 1:
    Input: s = "()"
    Output: 1

Example 2:
    Input: s = "(())"
    Output: 2

Example 3:
    Input: s = "()()"
    Output: 2
 
Constraints:
    2 <= s.length <= 50
    s consists of only '(' and ')'.
    s is a balanced parentheses string.

*/

    //my leetcode solns -> 2 approaches

/*  using variables - more optimal soln (time)
class Solution {
    public int scoreOfParentheses(String s) {
        int depth = 0, result = 0;
        char prev = '(';
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
            } else {
                depth--;
                if (prev == '(')
                    result += Math.pow(2, depth);
            }
            prev = ch;
        }
        return result;
    }
} 
*/

/*  using stack 
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(score);
                score = 0;
            } else {
                score = st.pop() + Math.max(2 * score, 1);
            }
        }
        return score;
    }
} 
*/