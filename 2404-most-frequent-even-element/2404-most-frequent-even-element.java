import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int n : nums) {
            if (n % 2 == 0) {
                freq.put(n, freq.getOrDefault(n, 0) + 1);
            }
        }
        
        int ans = -1, maxFreq = 0;
        for (int key : freq.keySet()) {
            int count = freq.get(key);
            if (count > maxFreq || (count == maxFreq && key < ans)) {
                ans = key;
                maxFreq = count;
            }
        }
        
        return ans;
    }
}

