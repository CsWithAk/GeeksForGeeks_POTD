class Solution:
    def canFormPalindrome(self, s):
        # code here
        freq = [0] * 26
        
        for c in s:
            freq[ord(c) - ord('a')] += 1
        
        oddCount = 0
        for count in freq:
            if count % 2!= 0:
                oddCount += 1
                
        return oddCount <= 1
