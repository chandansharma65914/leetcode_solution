class Solution {
    public int numberOfSteps(int num) {
        return count( num, 0);
    }
    public static int count(int num, int step){
        if(num==0){
            return step;
        }
        if(num%2==0){
            return count(num/2,step+1);
        }else{
            return count(num-1,step+1);
        }
    }
}