class Solution {
    public int gofor(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid= s+ (e-s)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(nums[s]<=nums[mid]){
            if(target>= nums[s] && target<=nums[mid]){
                return gofor(nums, target,s,mid-1);
            }else{
                return gofor(nums,target,mid+1,e);
            }
        }else{
            if(target>= nums[mid] && target<=nums[e]){
                return gofor(nums, target,mid+1,e);
            }else{
               return gofor(nums, target,s,mid-1);
            }
        }
    }
    public int search(int[] nums, int target) {
        return gofor( nums,  target,0 , nums.length-1);
    }
}