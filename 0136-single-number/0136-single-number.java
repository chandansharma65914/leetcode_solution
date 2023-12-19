class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int i: nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        for(var x: map.entrySet()){
            if(x.getValue()==1){
                return x.getKey();
            }
        }
        return 0;
    }
}