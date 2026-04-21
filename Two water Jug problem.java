class Solution {
    public int minSteps(int m, int n, int d) {
        // code here
        if (d > Math.max(m, n) || d % gcd(m, n) != 0){
            return -1;
        }
        if (d == 0){
            return 0;
        }
        return Math.min(pour(m, n, d), pour(n,m,d));
    }
    private int pour(int a, int b, int d){
        int count = 0;
        int x = 0, y = 0;
        
        while (x != d && y != d){
            if (x == 0){
                x = a;
                count++;
            } else if (y == b){
                y = 0;
                count++;
            } else {
                int pour_a = Math.min(x, b - y);
                x -= pour_a;
                y += pour_a;
                count++;
            }
        }
        return count;
    }
    private int gcd(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
