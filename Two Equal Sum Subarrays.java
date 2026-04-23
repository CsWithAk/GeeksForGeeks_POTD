import java.util.Arrays;

class Solution {
    public boolean canSplit(int arr[]) {
        int sum = Arrays.stream(arr).sum();
        // code here 
        if (sum % 2 == 1) return false;
        
        int target = sum / 2;
        int runner = 0;
        
        for (int i = 0; i < arr.length - 1; i++) { 
            runner += arr[i];
            if (runner == target) {
                return true;
            }
        }
        return false;
    }
}
