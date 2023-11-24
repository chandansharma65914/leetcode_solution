class Solution {
    public int sum(int n){
        int ans=0;
        while(n>0){
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
    public int addDigits(int num) {
          
        if(num<10){
            return num;
        }
        return addDigits(sum(num));
    }
}