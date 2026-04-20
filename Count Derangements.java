class Solution {
    public int derangeCount(int n) {
        // code here
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        long prev2 = 0;
        long prev1 = 1;
        long cur = 0;
        for (int i = 3; i <= n; i++){
            cur = (i - 1) * (prev1 + prev2);
            prev2 = prev1;
            prev1 = cur;
        }
        return n == 0 ? 1 : (int)prev1;
    }
};
