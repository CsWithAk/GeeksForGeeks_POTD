class Solution {
  public:
    vector<int> nextPalindrome(vector<int>& num) {
        // code here
        int n = num.size();
        bool all9 = true;
        for (int d : num){
            if (d!=9){
                all9 = false;
                break;
            }
        }
        if (all9){
            vector<int> res(n + 1, 0);
            res[0] = 1;
            res[n] = 1;
            return res;
        }
        int mid = (n + 1) / 2;
        vector<int>left(num.begin(), num.begin()+mid);
        vector<int> pal=makePalindrome(left, n);
        if (pal > num){
            return pal;
        }
        for (int i = mid - 1; i>= 0; i--){
            if (left[i] < 9){
                left[i]++;
                break;
            } else{
                left[i] = 0;
            }
        }
        return makePalindrome(left, n);
    }
    private:
    vector<int> makePalindrome(vector<int>& left, int n){
        vector<int> res(n);
        int mid = (n + 1) / 2;
        for (int i = 0; i < mid; i++){
            res[i] = left[i];
        }
        int i = mid - 1;
        int j = (n % 2 == 0)? mid : mid - 1;
        while (i >= 0 && j < n){
            res[j] = left[i];
            i--;
            j++;
        }
        return res;
    }
};
