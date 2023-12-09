class Solution {
    public static int gofor(int x, int y, int[][] arr){
        int ans= Integer.MIN_VALUE;
        
        for(int i=x-1;i<= x+1;i++ ){
            for(int j=y-1;j<= y+1;j++){
                ans= Math.max(ans,arr[i][j]);
            }
        }
        return ans;
    }
    public int[][] largestLocal(int[][] grid) {
        int n= grid.length;
        int[][] ans= new int[n-2][n-2];
        
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                ans[i-1][j-1]= gofor(i,j,grid);
            }
        }
        return ans;
    }
}