class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if( target >= letters[n-1]){
            return letters[0];
        }
        int s=0;
        int e= n-1;
        while(s<=e){
            int m= s + (e-s)/2;
            if(letters[m]<= target){
                s = m +1;
            }else{
                e= m-1;
            }
        }
        return letters[s];
    }
}