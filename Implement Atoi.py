class Solution:
    def myAtoi(self, s):
        # code here
        s = s.strip()
        if not s:
            return 0
        a = -1 if s[0] == "-" else 1
        if s[0] in ["+","-"]:
            s = s[1:]
        b = 0
        for c in s:
            if not c.isdigit():
                break
            b = b * 10 + int(c)
        b *= a
        return max(-2**31, min(b, 2**31-1))
