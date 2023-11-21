class Solution {
    public int gofor(int min , int max){
           if(max%min==0){
               return min;
           }
           
           return gofor( max%min,min);
    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i : nums){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        return gofor(min, max);
    }
}