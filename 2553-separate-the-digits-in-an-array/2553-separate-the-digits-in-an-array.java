class Solution {
    
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for( int c : nums){
           String str= String.valueOf(c);
            
            for(int i=0;i<str.length();i++){
                list.add(Character.getNumericValue(str.charAt(i)));
            }
            
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}