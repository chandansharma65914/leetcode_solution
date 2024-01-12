class Solution {
    public int countPrefixes(String[] words, String s) {
        int count=0;
        
        for(var str: words){
            if(s.startsWith(str)){
                count++;
            }
        }
        return count;
    }
}