class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strs){
            int[] charCount = new int[26];

            for(char ch : str.toCharArray()){
                charCount[ch-'a']++;
            }
            
            StringBuilder keyBuilder = new StringBuilder();
            for(int count : charCount){
                keyBuilder.append('#');
                keyBuilder.append(count);
            }
            String key = keyBuilder.toString();

            if(!anagramMap.containsKey(key)){
                anagramMap.put(key, new ArrayList<>());
            }
            anagramMap.get(key).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}