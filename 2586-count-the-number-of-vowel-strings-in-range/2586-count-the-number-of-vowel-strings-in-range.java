class Solution {
    public int vowelStrings(String[] words, int left, int right) {
     
        int count=0;
        String str="aeiou";
        for(int i=left;i<=right;i++){
          
           if(str.contains(Character.toString(words[i].charAt(0))) && str.contains(Character.toString(words[i].charAt(words[i].length()-1)))){
               count++;
           }
        }
        return count;
    }
}