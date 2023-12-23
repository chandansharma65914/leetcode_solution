class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int x= map.get(s.charAt(0));
    for( Integer i: map.values()){
        if(i!=x){
            return false;
        }
    
        
    }return true;
    }
}