class Solution {
    public int minLength(String s) {
        Stack<Character> stk= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.empty()){
                stk.push(s.charAt(i));
            }else{
                if((""+stk.peek()+s.charAt(i)).equals("AB")|| (""+stk.peek()+s.charAt(i)).equals("CD") ){
                    stk.pop();
                }else{
                    stk.push(s.charAt(i));
                }
            }
        }
        return stk.size();
    }
}