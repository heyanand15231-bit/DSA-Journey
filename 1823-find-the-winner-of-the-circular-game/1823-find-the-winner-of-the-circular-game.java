class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) list.add(i);
        return solve(list, k, 0);
    }

    private int solve(List<Integer> list, int k, int index) {
        if (list.size() == 1) 
            return list.get(0);

        index = (index + k - 1) % list.size();
        list.remove(index);

        return solve(list, k, index);
    }
}
