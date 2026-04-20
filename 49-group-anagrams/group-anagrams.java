class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> anagrams = new HashMap<>();

        for(String s : strs){
            char c[] = s.toCharArray();

            Arrays.sort(c);
            String  Key = String.valueOf(c);
            if(!anagrams.containsKey(Key)){
                anagrams.put(Key, new ArrayList<>());
            }
            anagrams.get(Key).add(s);
        }
        return new ArrayList(anagrams.values());
      
                
    }
}