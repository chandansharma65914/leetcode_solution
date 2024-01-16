class Solution {
    public String greatestLetter(String s) {
        String ls= s.toLowerCase();
        
        boolean a[]= new boolean[26];

        boolean b[]= new boolean[26];

        for(int i=0;i<s.length();i++){
           if(ls.charAt(i)==s.charAt(i)){
               b[ls.charAt(i)-'a']=true;
           } else{
               a[s.charAt(i)-'A']=true;
           }
        }
         for(int i=25;i>=0;i--){
            if( a[i]==b[i] && a[i]){
                return String.valueOf((char)(65+i));
            }
         }


return "";
    }
}