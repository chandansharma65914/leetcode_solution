class Solution {
    public int maximumProduct(int[] nums) {
        
        
       int n= nums.length;
        
        int maxa=Integer.MIN_VALUE;
        int maxb=Integer.MIN_VALUE;
        int maxc=Integer.MIN_VALUE;
        
       
         int mina= Integer.MAX_VALUE;
         int minb= Integer.MAX_VALUE;
         int minc= Integer.MAX_VALUE;
        
        for( int num : nums){
            if(num>maxa){
                maxc=maxb;
                maxb=maxa;
                maxa=num;
            }else if(num>maxb){
                maxc=maxb;
                maxb=num;
            }else if(num>maxc){
                maxc=num;
            }
            if(num<mina){
                minc=minb;
                minb=mina;
                mina=num;
            }else if(num<minb){
                minc=minb;
                minb=num;
            }else if(num<minc){
                minc=num;
            }
        }
        return Math.max(mina*minb*maxa , maxa*maxb*maxc);
    }
}