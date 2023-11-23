class Solution {
    
    public static int sum(int x){
        int ans=0;
        while(x>0){
            ans+= x%10;
            x/=10;
        }
        return ans;
    }
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(sum(i)%2==0){
                count++;
            }
        }
        return count;
    }
}