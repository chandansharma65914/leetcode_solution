class Solution {

    public int countBalls(int lowLimit, int highLimit) {

        HashMap<Integer, Integer> map = new HashMap<>();
             int ans = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int n = i;
            int key = 0;
            while (n > 0) {
                key += n % 10;
                n /= 10;
            }
            map.put(key, map.getOrDefault(key, 0) + 1);
            ans= Math.max(ans, map.get(key));
        }
       
        
        return ans;
    }
}