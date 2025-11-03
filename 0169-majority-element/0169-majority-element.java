class Solution {
    public int majorityElement(int[] nums) {


        int count =1;
        int cand=nums[0];
        for(int i =1 ;i<nums.length;i++){
            if(count==0){
                cand= nums[i];
            }
            if(nums[i]==cand){
                count++;
            }else{
                count--;
            }
            
        }
        return cand;
    }
}