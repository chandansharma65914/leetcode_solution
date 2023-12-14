class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String str: details){
            if(Integer.parseInt(""+str.charAt(11)+str.charAt(12))>60){
                    count++;
            }
        }
        return count;
    }
}