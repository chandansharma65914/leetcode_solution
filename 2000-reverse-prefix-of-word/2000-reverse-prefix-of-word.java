class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb= new StringBuilder();
        boolean flag= true;
        for( int i=0;i<word.length();i++){
            sb.append(word.charAt(i));
            if(word.charAt(i)==ch && flag){
                sb=sb.reverse();
                flag=false;
            }
        }
        return sb.toString();
    }
}