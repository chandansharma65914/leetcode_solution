class Solution {
   
    public int countCharacters(String[] words, String chars) {
        int ans=0;
        int [] carr= new int[26];
        for(int i=0;i<chars.length();i++){
            carr[chars.charAt(i)-'a']++;
        }
        for(var str: words){          
            if(check(str, carr)){
                ans+= str.length();
            }
        }    
        return ans;
    }
    public static boolean check(String str , int[] arr){
          int[] carr= new int[26];
          for(int i=0;i<str.length();i++){
              int x= str.charAt(i)-'a';
              carr[x]++;
              if(carr[x]>arr[x]){
                  return false;
              }
          }
          return true;
    }
}