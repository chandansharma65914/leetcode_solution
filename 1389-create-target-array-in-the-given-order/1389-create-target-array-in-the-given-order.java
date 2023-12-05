class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       List<Integer> ans= new ArrayList<>();
        for(int i=0;i<index.length;i++){
            ans.add(index[i], nums[i]);
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}