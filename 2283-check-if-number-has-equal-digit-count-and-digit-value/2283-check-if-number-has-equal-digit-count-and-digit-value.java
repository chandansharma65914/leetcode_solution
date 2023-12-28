class Solution {
    public boolean digitCount(String num) {
          Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<num.length();i++){
            map.put(num.charAt(i), map.getOrDefault(num.charAt(i),0)+1);
        }
         for(int i=0;i<num.length();i++){
           String s=Integer.toString(i);
           if(Character.getNumericValue(num.charAt(i))!=map.getOrDefault(s.charAt(0),0)){
               return false;
           }
        }
        return true;
    }
}