class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int curr=0;
        for(int x : nums){
          curr+=x;
          ans=Math.max(ans,curr);
          if(curr<0){
            curr=0;
          }
        }
        return ans;
    }
}