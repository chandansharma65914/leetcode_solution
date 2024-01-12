class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
           int x= s.length();
        StringBuilder sb= new StringBuilder();
        for(var str : words){
            sb.append(str);
            if(sb.length()==x){
                if(s.equals(sb.toString())){
                    return true;
                }
            }else if(sb.length()>x){
                return false;
            }
        }
        return false;
    }
}