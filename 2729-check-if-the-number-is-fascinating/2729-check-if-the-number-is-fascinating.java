class Solution {
    public boolean isFascinating(int n) {
        int x= 2*n;
        int y=3*n;
        String str= ""+n+ x+y;
        boolean [] arr = new boolean[9];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                return false;
            }
            if(arr[Character.getNumericValue(str.charAt(i))-1]){
                return false;
            }
            arr[Character.getNumericValue(str.charAt(i))-1]=true;
        }
        return true;
    }
}