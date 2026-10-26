class Solution {
    public int findTheWinner(int n, int k) {
        int winner = 0; // base case: only 1 player
        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1; // +1 because players are 1-indexed
    }
}

