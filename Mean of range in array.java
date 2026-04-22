class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        // code here
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        long[] prefix = new long[n + 1];
        prefix[0] = 0;
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        
        for (int[] q : queries) {
            int l = q[0];
            int r = q[1];
            
            long rangeSum = prefix[r + 1] - prefix[l];
            int length = r - l + 1;
            int mean = (int)(rangeSum / length); 
            result.add(mean);
        }
        
        return result;
    }
}
