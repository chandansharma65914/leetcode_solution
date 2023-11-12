class Solution {
    public int removeElement(int[] nums, int val) {
      int count=0;
      int j=0;
      for(int i :nums){
          if(i!=val){
              
              count++;
              nums[j++]=i;
          }
      }
      return count;
    }
}