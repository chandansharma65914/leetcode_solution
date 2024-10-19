class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        return nums.length!= set.size();
    }
}