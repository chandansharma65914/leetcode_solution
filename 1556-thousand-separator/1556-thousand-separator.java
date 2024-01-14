class Solution {
    public String thousandSeparator(int n) {
        
        StringBuilder sb=new StringBuilder(" ");
        if(n<1000){
            return String.valueOf(n);
        }
          int count=0;
        while(n>0){
            int x= n%10;
              
           if(count==3){
               sb.insert(1,".");
               sb.insert(1,x);
               count=0;
           }else{
             sb.insert(1,x);
           }
           count++;
            n/=10;
        }
        return sb.toString().trim();
    }
}