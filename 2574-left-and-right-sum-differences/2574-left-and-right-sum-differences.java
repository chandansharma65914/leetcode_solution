class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int sum=0;
        for(int i: nums){
            sum+=i;
        }
        int lsum=0;
        for(int i=0;i<n;i++){
            int rsum= sum- nums[i]-lsum;
            ans[i]= Math.abs(rsum-lsum);
            lsum+=nums[i];
        }
        return ans;
    }
}