class Solution {
    static int[] nextPalindrome(int[] num) {
        // code here
        int n = num.length;
        boolean all9 = true;
        for (int d : num){
            if (d!=9){
                all9 = false;
                break;
            }
        }
        if (all9){
            int[] res = new int[n+1];
            res[0] = 1;
            res[n] = 1;
            return res;
        }
        int mid = (n + 1) / 2;
        int[] left = new int[mid];
        for (int i = 0; i < mid; i++){
            left[i] = num[i];
        }
        int[] pal = makePalindrome(left, n);
        if (compare(pal, num) > 0){
            return pal;
        }
        for (int i = mid - 1; i >= 0; i--){
            if (left[i] < 9){
                left[i]++;
                break;
            } else{
                left[i] = 0;
            }
        }
        return makePalindrome(left, n);
    }
    static int[] makePalindrome(int[] left, int n){
        int[] res = new int[n];
        int mid = (n + 1) / 2;
        for (int i = 0; i < mid; i++){
            res[i] = left[i];
        }
        int i = mid - 1;
        int j = n % 2 == 0? mid : mid - 1;
        while (i >= 0 && j < n){
            res[j] = left[i];
            i--;
            j++;
        }
        return res;
    }
    static int compare(int[] a, int[] b){
        for (int i = 0; i < a.length; i++){
            if (a[i] > b[i]) return 1;
            if (a[i] < b[i]) return -1;
        }
        return 0;
    }
    
}
