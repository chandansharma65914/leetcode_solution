class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stk= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stk.empty()){
                stk.push(s.charAt(i));
            }else{
                if(stk.peek()==s.charAt(i)){
                    stk.pop();
                }else{
                    stk.push(s.charAt(i));
                }
            }
        }
        StringBuilder ans= new StringBuilder();
        while(!stk.empty()){
            ans.insert(0,stk.pop());
        }
        return ans.toString();
    }
}