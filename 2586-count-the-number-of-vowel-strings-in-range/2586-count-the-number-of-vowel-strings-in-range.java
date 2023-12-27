class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        Map<Character,Integer> map= new HashMap<>();
        map.put('a',1);
         map.put('e',1);
          map.put('i',1);
           map.put('o',1);
            map.put('u',1);
        int count=0;
        
        for(int i=left;i<=right;i++){
           String str= words[i];
           if(map.containsKey(str.charAt(0)) && map.containsKey(str.charAt(str.length()-1))){
               count++;
           }
        }
        return count;
    }
}