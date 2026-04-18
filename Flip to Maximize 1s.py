class Solution:
    def maxOnes(self, arr):
        # code her
        t_ones = sum(arr)
        pre = 0
        min_pre = 0
        max_gain = 0
        for a in arr:
            val = 1 if a == 0 else -1
            pre += val
            max_gain = max(max_gain, pre - min_pre)
            min_pre = min(min_pre, pre)
        return t_ones + max_gain
