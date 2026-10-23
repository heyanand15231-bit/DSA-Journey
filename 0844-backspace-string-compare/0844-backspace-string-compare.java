import java.util.*;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    String build(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(c);
            }
        }

        return st.toString();
    }
}