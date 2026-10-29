class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        
        solve(ans, new ArrayList<>(), nums, 0);


        return ans;  
    }
public void solve (List<List<Integer>> ans, List<Integer> curr, int[] nums, int i ){

// Base Case:-
    if(i == nums.length){
        if(!ans.contains(curr)){
            ans.add(new ArrayList<>(curr));
        }
return;
    }

    // Include :-
    curr.add(nums[i]);
    solve(ans, curr, nums, i+1);
    curr.remove(curr.size()-1);

    // Exclude :-
    solve(ans, curr, nums, i+1);
}
}