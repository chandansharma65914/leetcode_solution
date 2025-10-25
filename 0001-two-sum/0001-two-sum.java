class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        
        int[] ans= new int[2];
        int n= nums.length;
        for(int i=0;i<n;i++){
            int x = target- nums[i];
            if(map.containsKey(x)){
                ans[0]= map.get(x);
                ans[1]=i;
            }else{
                map.put(nums[i],i);
            }
        }
       
        return ans;
    }
}