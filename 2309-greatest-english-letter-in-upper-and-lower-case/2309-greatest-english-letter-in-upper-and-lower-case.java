class Solution {
    public String greatestLetter(String s) {
        for(int i='z';i>='a';i--){
          String low= Character.toString(i);
          String big= Character.toString(i-32);
            if(s.contains(low)&& s.contains(big)){
                return big;
            }
        }
return "";
    }
}