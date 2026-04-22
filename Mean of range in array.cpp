class Solution {
  public:
    vector<int> findMean(vector<int> &arr, vector<vector<int>> &queries) {
        // code here
        int n = arr.size();
        vector<int> result;
        result.reserve(queries.size());
        
        vector<long long> prefix(n + 1, 0);
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        
        for (auto &q : queries) {
            int l = q[0];
            int r = q[1];
            
            long long rangeSum = prefix[r + 1] - prefix[l];
            int length = r - l + 1;
            int mean = rangeSum / length; 
            result.push_back(mean);
        }
        
        return result;
    }
};
