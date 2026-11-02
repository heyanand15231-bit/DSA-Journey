
class Solution {
    public int reverse(int number) {
        long reversed = 0;

        while (number != 0) {
            int digit = number % 10;  
            reversed = reversed * 10 + digit;
            number /= 10;         
        }

        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) reversed;
    }
}
