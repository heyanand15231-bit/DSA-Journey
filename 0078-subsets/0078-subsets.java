import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        
        solve(ans, curr, nums, 0);
        
        return ans;
    }
    
    public void solve(List<List<Integer>> ans, List<Integer> curr, int[] nums, int i) {
        // Base Case
        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        // Include nums[i]
        curr.add(nums[i]);
        solve(ans, curr, nums, i + 1);
        
        // Exclude nums[i]
        curr.remove(curr.size() - 1);
        solve(ans, curr, nums, i + 1);
    }
    
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = obj.subsets(nums);
        for (List<Integer> sub : subsets) {
            System.out.println(sub);
        }
    }
}
