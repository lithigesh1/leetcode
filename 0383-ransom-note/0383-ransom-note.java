class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapMagazine = new HashMap<>();

        for(char ch : magazine.toCharArray()){
            mapMagazine.put(ch,mapMagazine.getOrDefault(ch,0)+1);
        }

        for(char ch : ransomNote.toCharArray()){
            if(!mapMagazine.containsKey(ch) || mapMagazine.get(ch)==0){
                return false;
            }
            mapMagazine.put(ch,mapMagazine.get(ch)-1);
        }
        return true;
    }
}