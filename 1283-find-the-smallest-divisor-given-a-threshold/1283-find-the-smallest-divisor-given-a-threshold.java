class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1, end=0;
        for(int e : nums){
            end = Math.max(e, end);
        }
        int ans=-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if (isValid(nums, threshold, mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    private boolean isValid(int[] nums, int threshold, int capacity) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil(num*1.0/capacity);
        }
        return sum <= threshold;
    }
}