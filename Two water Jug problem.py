from math import gcd
class Solution:
	def minSteps(self, m, n, d):
		# Code here
		if d > max(m, n) or d % gcd(m, n) != 0:
		    return -1
		if d == 0:
		    return 0
		def pour(a, b):
		    count = 0
		    x, y = 0, 0
		    while x != d and y != d:
		        if x == 0:
		            x = a
		            count += 1
		        elif y == b:
		            y = 0
		            count += 1
		        else:
		            pour_a = min(x, b - y)
		            x -= pour_a
		            y += pour_a
		            count += 1
		    return count
        return min(pour(m, n), pour(n, m))                count++;

