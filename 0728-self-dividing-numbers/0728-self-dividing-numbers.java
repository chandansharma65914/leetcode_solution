class Solution {
    public boolean checkSelfDividingNumber(int n){
        int x=n;
        while(x>0){
            int y=x%10;
            if(y!=0 && n%y!=0){
                return false;
            }else if(y==0){
                return false;
            }
            x/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>  list= new ArrayList<>();
        for(int i=left ;i<=right;i++){
            if(checkSelfDividingNumber(i)){
                list.add(i);
            }
        }
        return list;
    }
}