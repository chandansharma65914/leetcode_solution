class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> map= new HashMap<>();

        for( var str : words1){
            map.put( str, map.getOrDefault(str,0)+1);
        }
        int ans=0;
        for( var str : words2){
            if(map.containsKey(str)){
             if(map.get(str)==1){
                 ans++;
                 map.put(str, map.get(str)-1);
             }else if( map.get(str)==0){
                 ans--;
                 map.remove(str);
             }
            }
            
        }
       
       return ans;
    }
}