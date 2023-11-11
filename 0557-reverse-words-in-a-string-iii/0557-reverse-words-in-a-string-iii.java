class Solution {
    public String reverseWords(String s) {

        String[] str=s.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length;i++){
            sb.append(rever(str[i])+" ");
        }
        return sb.toString().trim();
    }
    public String rever(String s){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.insert(0,s.charAt(i));
        }
        return sb.toString();
    }
}