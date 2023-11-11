class Solution {
    public boolean backspaceCompare(String s, String t) {
        return gofor(s).equals(gofor(t));
    }
    public String gofor(String s){
        Stack<Character> stk= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.empty()){
                if(s.charAt(i)!='#'){
                    stk.push(s.charAt(i));
                }
            }else{
                if(s.charAt(i)!='#'){
                    stk.push(s.charAt(i));
                }else{
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