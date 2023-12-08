class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> list :items){
            if(ruleKey.equals("type")){
                if(ruleValue.equals(list.get(0))){
                    count++;
                }
            }else if(ruleKey.equals("color")){
                if(ruleValue.equals(list.get(1))){
                    count++;
                }
            } else if(ruleKey.equals("name")){
                if(ruleValue.equals(list.get(2))){
                    count++;
                }
            }
        }
        return count;
    }
}