class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] rM = new int[n];
        rM[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            rM[i] =Math.max(height[i],rM[i+1]);
        }

        int lM = height[0];
        int ans = 0;

        for(int i=1; i<n-1; i++){
            lM = Math.max(height[i],lM);

            ans += Math.min(rM[i], lM) - height[i];

        }

        return ans;   
    }
}