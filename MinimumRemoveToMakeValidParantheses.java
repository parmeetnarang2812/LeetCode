/* 
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();

        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(')
                st.push(i);
            else if (ch[i] == ')') {
                if (st.isEmpty())
                    ch[i] = '#'; // Unnecessary ')'. Mark for removal
                else
                    st.pop(); // A matching '(' has been found. Pop the stack.
            }
        }
        // Now for all '(' in the stack, replace the character with '*' because corresponding ')' doesn't exist
        while (!st.isEmpty()) {
            ch[st.pop()] = '#';
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '#')
                sb.append(ch[i]);
        }
        return sb.toString();
    }
} 
*/