class Solution:
    def canSplit(self, arr):
        #code here
        total = sum(arr)
        
        if total % 2 == 1:
            return False
        
        target = total // 2
        runner = 0
    
        for i in range(len(arr) - 1):
            runner += arr[i]
            if runner == target:
                return True
                
        return False
