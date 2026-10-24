class Solution {
    public int maximalRectangle(char[][] mat) {
        if (mat.length == 0) return 0;
        int n = mat[0].length, maxArea = 0;
        int[] copy = new int[n];
        
        for (char[] row : mat) {
            for (int j = 0; j < n; j++) 
                copy[j] = row[j] == '1' ? copy[j] + 1 : 0;
            
            maxArea = Math.max(maxArea, rect(copy));
        }
        return maxArea;
    }

    private int rect(int[] h) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for (int i = 0; i <= h.length; i++) {
            int ht = (i == h.length ? 0 : h[i]);
            while (!st.isEmpty() && ht < h[st.peek()]) {
                int height = h[st.pop()];
                max = Math.max(max, height * (i - (st.isEmpty() ? -1 : st.peek()) - 1));
            }
            st.push(i);
        }
        return max;
    }
}
