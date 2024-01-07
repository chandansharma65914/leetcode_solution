class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] arr= new int[21];
        for(int i: bills){
            if(i==5){
                arr[i]++;
            }else if(i==10){
                if(arr[5]>0){
                    arr[5]--;
                    arr[10]++;
                }else{
                    return false;
                }
            }else{
                 if(arr[5]>=1 && arr[10]>=1){
                    arr[5]--;
                    arr[10]--;
                    arr[20]++;
                }else if(arr[5]>=3){
                    arr[5]-=3;
                    arr[20]++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}