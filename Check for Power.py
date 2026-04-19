class Solution:
    def isPower(self, x, y):
        # code here
        if y == 1:
            return True
        if x == 1:
            return False
        while y % x == 0:
            y = y // x
        return y == 1
