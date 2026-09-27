class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1, e = 0;
        for (int p : piles) e = Math.max(e, p); 
        
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (canEat(piles, h, mid)) {
                e = mid;
            } else {
                s = mid + 1; 
            }
        }
        return s;
    }
    
    private boolean canEat(int[] piles, int h, int speed) {
        int hours = 0;
        for (int p : piles) {
            hours += (p + speed - 1) / speed; 
        }
        return hours <= h;
    }
}
