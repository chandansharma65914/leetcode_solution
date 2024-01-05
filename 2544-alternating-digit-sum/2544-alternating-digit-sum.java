class Solution {
    public int alternateDigitSum(int n) {
        String  str=String.valueOf(n);
        int sum=0;
        
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                sum+=Character.getNumericValue(str.charAt(i));
            }else{
               sum-=Character.getNumericValue(str.charAt(i)); 
            }
        }
        return sum;
    }
}