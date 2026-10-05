class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findBound(nums, target, true), findBound(nums, target, false)};
    }

    private int findBound(int[] nums, int target, boolean first) {
        int s = 0, e = nums.length - 1, ans = -1;
        while (s <= e) {
            int mid = s + (e-s) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (first) e = mid - 1; else s = mid + 1;
            } else if (nums[mid] < target) s = mid + 1;
            else e = mid - 1;
        }
        return ans;
    }
}
