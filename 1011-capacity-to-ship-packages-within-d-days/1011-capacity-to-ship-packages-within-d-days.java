class Solution {
    public int shipWithinDays(int[] weights, int days) {
        if(days > weights.length)
            return -1;
        int start=weights[0], end=0;
        for(int weight : weights){
            start = Math.max(start, weight);
            end += weight;
        }
        int ans = -1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(isValid(weights, days, mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    public boolean isValid(int weights[], int days, int capacity){
        int curWeight=0, curDay=1;
        for(int weight : weights){
            if(curWeight+weight > capacity){
                curDay++;
                curWeight = weight;
                if(curDay > days)
                    return false;
            }else{
                curWeight += weight;
            }
        }
        return true;
    }
}