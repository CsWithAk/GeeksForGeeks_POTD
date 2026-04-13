class Solution:
    def nextPalindrome(self, num):
        # code here
        n = len(num)
        if num == [9] * n:
            return [1] + [0] * (n - 1) + [1]
        arr = num[:]
        mid = n // 2
        i = mid - 1
        j = mid + 1 if n % 2 else mid
        while i >= 0:
            arr[j] = arr[i]
            i -= 1
            j += 1
        if arr <= num:
            i = mid-1
            j = mid + 1 if n % 2 else mid
            if n % 2 == 1:
                if arr[mid] < 9:
                    arr[mid] += 1
                else:
                    arr[mid] = 0
                    carry = 1
                    while i >= 0:
                        if arr[i] < 9:
                            arr[i] += 1
                            carry = 0
                            break
                        else:
                            arr[i] = 0
                        i -= 1
                    i = mid - 1
                    j = mid + 1
                    while i >= 0:
                        arr[j] = arr[i]
                        i -= 1
                        j += 1
            else:
                carry = 1
                while i >= 0 and carry:
                    if arr[i] < 9:
                        arr[i] += 1
                        carry = 0
                    else:
                        arr[i] = 0
                    i -= 1
                i = mid - 1
                j = mid 
                while i >= 0:
                    arr[j] = arr[i]
                    i -= 1
                    j += 1
        return arr
