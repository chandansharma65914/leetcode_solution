class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(numOnes>=k){
            return k;
        }else{
            int sum=numOnes;
            int rem= k-numOnes;
            if(numZeros>=rem){
                return sum;
            }else{
                int kum= rem-numZeros;
                return sum-kum;
            }
        }
    }
}