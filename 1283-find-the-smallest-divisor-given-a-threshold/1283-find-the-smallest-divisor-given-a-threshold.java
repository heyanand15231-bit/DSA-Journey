class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1;
        int e = 0;
        int ans = -1;

        for (int ele : nums) {
            e = Math.max(e, ele);
        }

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (isPossible(nums, threshold, m)) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1; 
            }
        }
        return ans;
    }

    private boolean isPossible(int[] nums, int threshold, int divisor) {
        int sum = 0;
        for (int ele : nums) {
            sum += (ele + divisor - 1) / divisor;
            if (sum > threshold) return false;
        }
        return true;
    }
}
