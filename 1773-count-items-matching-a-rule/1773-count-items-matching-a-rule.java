class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int x=0;
        if(ruleKey.equals("color")){
            x=1;
        }else if(ruleKey.equals("name")){
            x=2;
        }
        
        for(List<String> list:items){
            if(list.get(x).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}