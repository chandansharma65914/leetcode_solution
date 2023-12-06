class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count =0;
        HashMap<String,Integer> arr = new HashMap<>();

        for(int i=0 ;i<words.length;i++){
             String r = new StringBuilder(words[i]).reverse().toString();
            if(arr.containsKey(r)){
               count++;
            }
            else{
                arr.put(words[i],0);
            }
        }
        return count;
    }
}