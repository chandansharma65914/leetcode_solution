class Solution {
    public boolean areNumbersAscending(String s) {
         String[] arr= s.split(" ");
        int x =-1;
        for(var str: arr){
            if(Character.isDigit(str.charAt(0))){
                if(x < Integer.parseInt(str)){
                    x= Integer.parseInt(str);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}