class Solution {
    public int countAsterisks(String s) {
        int count = 0, bar = 0;
        for (char c : s.toCharArray()) {
            if (c == '|') bar++;
            else if (c == '*' && bar % 2 == 0) count++;
        }
        return count;
    }
}
