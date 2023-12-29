class Solution {
    public static Map<Character,Integer> give(String str){
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<str.length();i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        return map;
    }
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        Map<Character,Integer> map= give(chars);
        for( String str :words){
            boolean flag=true;
            Map<Character,Integer> cmap= give(str);
              for( var x : cmap.entrySet()){
                  if(x.getValue()>map.getOrDefault(x.getKey(),0)){
                      flag=false;
                      break;
                  }
              }
            if(flag){
                ans+=str.length();
            }
        }
        return ans;
    }
}