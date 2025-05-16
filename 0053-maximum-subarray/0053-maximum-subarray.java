class Solution {
    public int maxSubArray(int[] arr) {
       int maxSoFar = arr[0]; // Maximum subarray sum so far
        int currentMax = arr[0]; // Current subarray sum ending at this position

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}