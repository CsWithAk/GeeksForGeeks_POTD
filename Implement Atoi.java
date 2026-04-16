class Solution {
    public int myAtoi(String s) {
        // code here
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }
        long b = 0; 
        while (i < s.length()) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            b = b * 10 + (c - '0');
            if (sign * b >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * b <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        
        return (int)(sign * b);
    }
}
