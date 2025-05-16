class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        int a= s.length();
        int b= t.length();
        for(int i=0;i<a;i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<b;i++){
            arr[t.charAt(i)-'a']--;
        }
        for(int x : arr){
            if(x!=0){
                return false;
            }
        }
        return true;
    }
}