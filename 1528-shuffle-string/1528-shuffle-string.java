class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb= new StringBuilder("");
        char[] arr= new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[indices[i]]= s.charAt(i);
        }
        for(char i: arr){
            sb.append(i);
        }
        return sb.toString();
    }
}