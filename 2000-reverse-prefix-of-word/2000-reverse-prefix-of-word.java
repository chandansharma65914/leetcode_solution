class Solution {
    public String reversePrefix(String word, char ch) {
       char[] arr= word.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                int x=0;
                int y=i;
                while(x<y){
                    char temp= arr[y];
                    arr[y]= arr[x];
                    arr[x]= temp;
                    x++;y--;
                }
                return String.valueOf(arr);
            }
        }
        return String.valueOf(arr);
    }
}