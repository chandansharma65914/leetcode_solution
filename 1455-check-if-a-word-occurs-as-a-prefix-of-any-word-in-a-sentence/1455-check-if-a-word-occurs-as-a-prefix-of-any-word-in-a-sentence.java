class Solution {
    public int isPrefixOfWord(String sentence, String word) {
        String[] arr= sentence.split(" ");
         for(int i=0;i<arr.length;i++){
             if(arr[i].startsWith(word)){
                 return i+1;
             }
         }
         return -1;
    }
}