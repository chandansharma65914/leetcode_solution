class Solution {
    public static int gofor(String str){
        int ans=0;
        for(int i=0;i<str.length();i++){
            ans*=10;
            ans+= str.charAt(i)-'a';
        }
        return ans;
    }
    public boolean isSumEqual(String f, String s, String t) {
        return gofor(f)+gofor(s)==gofor(t);
    }
}