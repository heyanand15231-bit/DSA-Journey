import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums2) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int n : nums1) {
            if (freq.getOrDefault(n, 0) > 0) {
                result.add(n);
                freq.put(n, freq.get(n) - 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
