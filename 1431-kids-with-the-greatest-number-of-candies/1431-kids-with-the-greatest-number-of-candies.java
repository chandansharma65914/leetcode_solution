class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int x) {
        int max=0;
        for(int i: candies){
            max= Math.max(max,i);
        }
        List<Boolean> list= new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            list.add(candies[i]+ x >= max);
        }
        return list;
    }
}