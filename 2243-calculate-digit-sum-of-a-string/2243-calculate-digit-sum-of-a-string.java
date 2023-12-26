class Solution {

    public static String gofor(String str, int k){
        StringBuilder sb= new StringBuilder();
        int i=0;
        int count=0;
         int sum=0;
        while(i  < str.length()){
          
           sum+= Character.getNumericValue(str.charAt(i));
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
           
    
        return sb.toString();
    }
    public String digitSum(String s, int k) {
          
            while(s.length()>k){
                s= gofor(s,k);
            }
            return s;
    }
}