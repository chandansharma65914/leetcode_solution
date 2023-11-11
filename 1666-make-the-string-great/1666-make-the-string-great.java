class Solution {
    public String makeGood(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0; i<s.length();i++){
           if(stack.empty()){
               stack.push(s.charAt(i));
           }else{
               if(stack.peek()==s.charAt(i)){
                    stack.push(s.charAt(i));
               }else{
                   String s1= ""+stack.peek();
                   String s2=""+s.charAt(i);

                   if(s1.toLowerCase().equals(s2.toLowerCase())){
                       stack.pop();
                   }else{
                       stack.push(s.charAt(i));
                   }
               }
           }
        }
        String ans="";
        for(Character k : stack){
            ans+=k;
        }
        return ans;
    }
}