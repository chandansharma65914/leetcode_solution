class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb= new StringBuilder(s);
        for(int i=1;i<s.length();i+=2){
            char c= (char)(s.charAt(i-1)+Character.getNumericValue(s.charAt(i)));
            sb.setCharAt(i,c);
        }
        return sb.toString();
    }
}