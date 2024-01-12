class Solution {
    public int prefixCount(String[] words, String pref) {
           int x= pref.length();
        int count=0;
          for (String str : words){
              if(str.length()>=x){
                  if(str.substring(0,x).equals(pref)){
                      count++;
                  }
              }
          }
        return count;
    }
}