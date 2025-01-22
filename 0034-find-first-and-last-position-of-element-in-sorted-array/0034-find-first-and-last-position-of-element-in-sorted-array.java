class Solution {
    public int[] searchRange(int[] nums, int target) {
           int ans[]= {-1,-1};
           ans[0]= search(nums,target,true);
           ans[1]= search(nums,target,false);
           return ans;
    }
    public int search(int[] nums , int target , boolean left){
        int ans=-1;
        int s=0;
        int e= nums.length-1;

        while(s<=e){
            int m= s + (e-s)/2;
            if(target< nums[m]){
                e=m-1;
            }else if(target> nums[m]){
                s= m+1;
            }else{
                ans= m;
                if(left){
                    e= m-1;
                }else{
                    s= m+1;
                }
            }
        }
        return ans;
    }
}