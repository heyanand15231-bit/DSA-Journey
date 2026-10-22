class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int temp = 0;

        while (i >= 0 || j >= 0 || temp > 0) {
            if (i >= 0) temp += a.charAt(i--) - '0';
            if (j >= 0) temp += b.charAt(j--) - '0';

            sb.append(temp % 2); 
            temp /= 2;             
        }
        return sb.reverse().toString();
    }
}
