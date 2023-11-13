class Solution {
    public int countDigits(int num) {
        String s=Integer.toString(num);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(num % Character.getNumericValue(s.charAt(i))==0 ){
                count++;
            }
        }
        return count;
    }
}