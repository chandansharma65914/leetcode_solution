class Solution {
    public int rearrangeCharacters(String s, String t) {
        int [] arr= new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int [] brr= new int[26];
      
        for(int i=0;i<t.length();i++){
            int x=t.charAt(i)-'a';
            brr[x]++;   
        }
        int ans= Integer.MAX_VALUE;
       for(int i=0;i<t.length();i++){
            int x=t.charAt(i)-'a';
            ans=Math.min(ans, arr[x]/brr[x]);
        }
        return ans;
    }
}