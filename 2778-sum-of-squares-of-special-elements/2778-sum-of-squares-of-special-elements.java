class Solution {
    public int sumOfSquares(int[] nums) {
        int sum=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            int x=i+1;
            if(n% x==0 ){
                sum+= Math.pow(nums[i],2);
            }
        }
        return sum;
    }
}