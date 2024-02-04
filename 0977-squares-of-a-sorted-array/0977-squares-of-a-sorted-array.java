class Solution {
    public int[] sortedSquares(int[] nums) {
       for(int i=0;i<nums.length;i++){
           nums[i]= nums[i]*nums[i];
       }
        
        
        //this is comment
       Arrays.sort(nums);
       return nums;
    }
}