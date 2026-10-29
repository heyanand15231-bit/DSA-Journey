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
            //List<Integer> temp = new ArrayList<>();
            //for(int ele : curr) temp.add(ele);
            // ans.add(temp);
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        // Include 
        curr.add(nums[i]);
        solve(ans, curr, nums, i + 1);
        
        // Exclude
        curr.remove(curr.size() - 1);
        solve(ans, curr, nums, i + 1);
    }
    
}
