class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        int x=Integer.MIN_VALUE;
        for(int i:nums){
            x= Math.max(x,i);
        }
        int ans=0;
        for(int i=0;i<k;i++){
            ans+=x++;
        }
        return ans;
    }
}