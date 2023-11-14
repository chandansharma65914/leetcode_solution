class Solution {
    public int digitSum(int num){
        int sum=0;
        while(num>0){
            int x=num%10;
            sum+=x;
            num/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int rum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rum+=digitSum(nums[i]);
        }
       return sum-rum;
    }
}