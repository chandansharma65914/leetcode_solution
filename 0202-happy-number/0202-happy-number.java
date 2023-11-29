class Solution {
    public int go(int n){
        int ans=0;
        while(n>0){
            ans+= (n%10 * (n%10));
            n/=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set= new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=go(n);
        }
        return n==1;
    }
}