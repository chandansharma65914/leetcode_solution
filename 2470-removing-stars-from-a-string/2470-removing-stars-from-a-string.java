class Solution {
    public String removeStars(String s) {
        Stack<Character> stk= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stk.push(s.charAt(i));
            }else{
                if(!stk.empty()){
                    stk.pop();
                }
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!stk.empty()){
             sb.insert(0,stk.pop());
        }
        return sb.toString();
    }
}