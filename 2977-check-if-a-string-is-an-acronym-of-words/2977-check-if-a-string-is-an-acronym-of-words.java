class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        int count=0;
        int j=0;
        for(int i=0;i<words.size();i++){
            if(words.get(i).charAt(0)==s.charAt(j++)){
                count++;
            }
        }
        return count==s.length();
    }
}