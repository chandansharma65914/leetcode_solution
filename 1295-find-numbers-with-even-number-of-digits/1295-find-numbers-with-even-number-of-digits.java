class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            String str=(""+i);
               
            if(str.length()%2==0){
                count++;
            }
            
        }
        return count++;
    }
}