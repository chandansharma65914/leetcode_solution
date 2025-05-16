class Solution {
    public int lengthOfLongestSubstring(String s) {
          
            
        int n= s.length();
        if(n==0 ||n ==1){
            return n;
        }
        int max=0;
        int j=0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            char c= s.charAt(i);
           if(map.containsKey(c)){
                j= Math.max(j,map.get(c)+1);            
           }
           max=Math.max(max,i-j+1);
           map.put(c,i);

        }
        return max;
    }
}