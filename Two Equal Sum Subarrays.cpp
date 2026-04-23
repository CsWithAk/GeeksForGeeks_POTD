#include <numeric> 
class Solution {
  public:
    bool canSplit(vector<int>& arr) {
        int sum = accumulate(arr.begin(), arr.end(), 0);
    
        if (sum % 2 == 1) return false;
        
        int target = sum / 2;
        int runner = 0;
        
        for (int i = 0; i < arr.size() - 1; i++) {
            runner += arr[i];
            if (runner == target) {
                return true;
            }
        }
        return false;
    }
};
