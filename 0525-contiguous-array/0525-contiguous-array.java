import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> Map = new HashMap<>();
        int Sum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            Sum += (nums[i] == 1 ? 1 : -1);
            if (Sum == 0) {
                maxLen = i + 1;
            }
            if (Map.containsKey(Sum)) {
                maxLen = Math.max(maxLen, i - Map.get(Sum));
            } else {
                Map.put(Sum, i);
            }
        }
        return maxLen;
    }
}
