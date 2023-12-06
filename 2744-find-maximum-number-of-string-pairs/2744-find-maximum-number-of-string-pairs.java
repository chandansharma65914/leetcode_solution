class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        int n=words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                
                if(words[i].equals(new StringBuilder(words[j]).reverse().toString())){
                    count++;
                }
            }
        }
        return count;
    }
}