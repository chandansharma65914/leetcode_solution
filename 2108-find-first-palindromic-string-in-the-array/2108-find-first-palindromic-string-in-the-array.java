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
    public String firstPalindrome(String[] words) {
        for(String i: words){
            if(checkPalin(i)){
                return i;
            }
        }
        return "";
    }
}