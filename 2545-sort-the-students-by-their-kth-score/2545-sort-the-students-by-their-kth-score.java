class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
        int i=0;
        int j=1;
        while(j<score.length && i< score.length){
            if(score[i][k]< score[j][k]){
                int[] temp=  score[j];
                score[j]=score[i];
                score[i]=temp;
                i=0;j=1; 
            }else{
                i++;j++;
            }
        }return score;
    }
}