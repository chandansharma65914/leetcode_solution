class Solution {
      public boolean checkPalin(String str){
        int i=0;
        int n= str.length();
        int j=n-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public boolean isPalindrome(String abc) {
        String s= abc.toLowerCase();
        StringBuilder sb= new StringBuilder();
        for( int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        return checkPalin(sb.toString());
    }
}