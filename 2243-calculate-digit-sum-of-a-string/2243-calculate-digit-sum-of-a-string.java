class Solution {

   
    public String digitSum(String s, int k) {
          if( s.length()<=k){
              return s;
          }
        StringBuilder sb= new StringBuilder();
        int i=0;
        int count=0;
         int sum=0;
        while(i  < s.length()){
          
           sum+= Character.getNumericValue(s.charAt(i));
           count++;
           i++;
            if(count==k){
               sb.append(sum);
               sum=0 ;
               count=0;
           }
        }
          if(count!=0){
              sb.append(sum);
          }
           
            return digitSum(sb.toString(),k);
    }
}