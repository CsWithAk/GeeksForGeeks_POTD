class Solution:
    def derangeCount(self, n: int) -> int:
        # code here
        if n == 1:
            return 0
        if n == 2:
            return 1
        a, b = 1, 0    # here 1 = 0 and 0 = 1
        for i in range(2, n + 1):
            c = (i - 1) * (a + b)
            a, b = b, c
        return b
