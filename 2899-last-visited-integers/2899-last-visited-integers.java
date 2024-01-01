class Solution {
    public List<Integer> lastVisitedIntegers(List<String> words) {
          
        List<Integer> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int count=0;
        
        for( String str:words){
            if(Character.isDigit(str.charAt(0))){
               list.add(Integer.parseInt(str));
                count=0;
            }else{
              count++;
                int x=list.size();
                if(count>x){
                    ans.add(-1);
                }else{
                    ans.add(list.get(x-count));
                }
            }
        }
        return ans;
    }
}