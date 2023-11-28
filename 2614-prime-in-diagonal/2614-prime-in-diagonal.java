class Solution {
    public static boolean prime(int n){
    if (n<=1){
        return false;
    }
    for (int i=2; i<=Math.sqrt(n); i++){
        if (n%i==0){
            return false;
        }
    }
    return true;
}
    public int diagonalPrime(int[][] nums) {
         int result =0; 
         int m= nums[0].length;
         for(int i=0; i<nums.length; i++){
             if(prime(nums[i][i])){
                 result=Math.max(result, nums[i][i]);
             }
             if(prime(nums[i][m-1-i])){
                 result=Math.max(result, nums[i][m-1-i]);
             }
         }
         return result;
    } 
     
    
}