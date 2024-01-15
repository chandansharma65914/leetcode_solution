class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                
                if(check(words[i],words[j])){
                    count++;
                }
            
            }
        }
        return count;
    }
    public boolean check(String s1, String s2){

          boolean arr1[]= new boolean[26];
          boolean arr2[]= new boolean[26];
          
          for( char c : s1.toCharArray()){
              arr1[c-'a']=true;
          }

          for( char c : s2.toCharArray()){
              arr2[c-'a']=true;
          }
          for( int i=0;i<26;i++){
              if(arr1[i]!= arr2[i]){
                  return false;
              }
          }
          return true;
        }
       
      

}