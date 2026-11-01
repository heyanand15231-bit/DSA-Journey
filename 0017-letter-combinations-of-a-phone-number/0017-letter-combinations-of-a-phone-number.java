import java.util.*;

class Solution {
    private String[] map = {
        "",    "",    "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        solve(ans, "", digits, 0);
        return ans;
    }

    public void solve(List<String> ans, String curr, String digits, int i) {
        if (i == digits.length()) {
            ans.add(curr);
            return;
        }

        String value = map[digits.charAt(i) - '0'];
        for (char ch : value.toCharArray()) {
            solve(ans, curr + ch, digits, i + 1);
        }
    }
}
