class Solution {
    public int repeatedNTimes(int[] nums) {
        
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], 1+map.get(nums[i]));
            }else{
                map.put(nums[i],1);
            }
        }
        int ans=0;
        for( var i: map.entrySet()){
            if(i.getValue()==nums.length/2){
                  return i.getKey();
            }
        }
        return ans;
    }
}