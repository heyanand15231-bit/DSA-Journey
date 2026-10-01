class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; // ASCII
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        
        int sum = 0;
        boolean isOdd = false;
        
        for (int freq : count) {
            if (freq % 2 == 0) {
                sum += freq;
            } else {
                sum += freq - 1;
                isOdd = true;
            }
        }
        
        return isOdd ? sum + 1 : sum;
    }
}
