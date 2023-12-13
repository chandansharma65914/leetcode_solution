class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i])==1){
                     map.put(nums[i],map.get(nums[i])-1);
                     sum-=nums[i];
                }
               
               
            }else{
                map.put(nums[i],1);
                sum+=nums[i];
            }
        }
        
        
        
        
        
        
        
        // Set<Integer> set= map.keySet();
        // for(Integer i: set){
        //     if(map.get(i)==1){
        //         sum+=i;
        //     }
        // }
        return sum;
    }
}