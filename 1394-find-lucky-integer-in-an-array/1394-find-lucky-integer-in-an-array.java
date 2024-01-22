class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        
        for(int c : arr){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int ans=-1;
        for(var  x : map.entrySet()){
            if(x.getKey()==x.getValue()){
                ans=Math.max(ans,x.getKey());
            }
        }
        //dsfsfsdfsdfs
        return ans;
    }
}