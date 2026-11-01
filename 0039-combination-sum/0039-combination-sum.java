import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(ans, curr, nums, target, 0);
        return ans;
    }

    public void solve(List<List<Integer>> ans, List<Integer> curr, int[] nums, int target, int i) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            curr.add(nums[j]);
            solve(ans, curr, nums, target - nums[j], j); // same element allowed again
            curr.remove(curr.size() - 1); // backtrack
        }
    }
}
