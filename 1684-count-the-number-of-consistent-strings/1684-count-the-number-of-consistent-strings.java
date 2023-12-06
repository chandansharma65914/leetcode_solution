class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;

        for(int i=0;i<words.length;i++){
            boolean flag=true;
            for(int j=0;j<words[i].length();j++){
               
                if(!allowed.contains(words[i].charAt(j)+"")){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ans++;
            }
        }
        return ans;
    }
}