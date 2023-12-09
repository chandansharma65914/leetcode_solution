class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};   
        String abc="abcdefghijklmnopqrstuvwxyz";
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<26;i++){
            map.put(abc.charAt(i),i);
        } 
        Set<String> set= new HashSet<>();
        for(int i=0;i<words.length;i++){
            StringBuilder sb= new StringBuilder();
            for(int j=0;j<words[i].length();j++){
                sb.append(arr[map.get(words[i].charAt(j))]);
            }
            set.add(sb.toString());
        }  
        return set.size();
    }
}