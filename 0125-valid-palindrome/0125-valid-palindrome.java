class Solution {
    public boolean isPalindrome(String s) {
            if(s.isEmpty()){
                return true;
            }
        int  i=0;
        int j=s.length()-1;

        while(i<j){
            char a= s.charAt(i);
            char b= s.charAt(j);
            if(!Character.isLetterOrDigit(a)){
                    i++;
            }else if(!Character.isLetterOrDigit(b)){
                j--;
            }else{
                if(Character.toLowerCase(a)!=Character.toLowerCase(b)){
                    return false;
                }else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}