class Solution {
    public String sortSentence(String s) {
        String[] arr= s.split(" ");
        String[]ans= new String[arr.length];
        for(String str : arr){
            int n= str.length();
           ans[Character.getNumericValue(str.charAt(n-1))-1]= str.substring(0,n-1);
        }
        StringBuilder sb= new StringBuilder();
        for( var x:ans){
            sb.append(x+" ");
        }
        return sb.toString().trim();
    }
}