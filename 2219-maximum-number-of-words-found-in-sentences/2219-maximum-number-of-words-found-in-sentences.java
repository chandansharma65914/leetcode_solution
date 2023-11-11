class Solution {
    public int gofor(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(int i=0;i<sentences.length;i++){
            count=Math.max(count,gofor(sentences[i]));
        }
        return count;
    }
}