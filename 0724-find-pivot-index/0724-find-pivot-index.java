class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int rum=0;
        for(int i=0;i<nums.length;i++){
            if(sum-nums[i]-rum==rum){
                return i;
            }
            rum+=nums[i];
        }
        return -1;
    }
}