class Solution {
  public:
    bool canFormPalindrome(string &s) {
        // code here
        int freq[26] = {0};
        
        for(char c : s) {
            freq[c - 'a']++;
        }
        
        int oddCount = 0;
        for(int count : freq) {
            if(count % 2!= 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }
};
