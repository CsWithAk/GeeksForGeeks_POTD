class Solution {
  public:
    int maxOnes(vector<int>& arr) {
        // code here
        int t_ones = 0;
        for (int a : arr){
            t_ones += a;
        }
        int pre = 0;
        int min_pre = 0;
        int max_gain = 0;
        for (int a : arr){
            int val = (a == 0) ? 1 : -1;
            pre += val;
            max_gain = max(max_gain, pre-min_pre);
            min_pre = min(min_pre, pre);
        }
        return t_ones + max_gain;
    }
};
