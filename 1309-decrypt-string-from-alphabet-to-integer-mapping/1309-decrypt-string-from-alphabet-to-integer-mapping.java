class Solution {
    public String freqAlphabets(String s) {
       int n= s.length()-1;
       StringBuilder sb= new StringBuilder();
           while(n>=0){

               if(s.charAt(n)=='#'){
                   int a=96+Integer.parseInt(s.substring(n-2,n));
                   sb.append((char)a);
                   n-=3;
               }else{
               int b=  96+ Character.getNumericValue(s.charAt(n));
                 sb.append((char)b);
                 n--;
               }
               

           }
           return sb.reverse().toString();
    }
}