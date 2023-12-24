class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb= new StringBuilder("");
        char a= '0';
        for(int i=num.length()-1;i>=0;i--){
           if(num.charAt(i)==a){
               continue;
           }else{
               a='b';
               sb.insert(0,num.charAt(i));
           }
        }
        return sb.toString();
    }
}