class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Character> charMapping = new HashMap<>(); 

        for(int i=0; i<s.length(); i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!charMapping.containsKey(original)){
                if(!charMapping.containsValue(replacement)){
                    charMapping.put(original,replacement);
                }else{
                    return false;
                }
            }else{
                char ogMap = charMapping.get(original);
                if(ogMap != replacement){
                    return false;
                }
            }
        }
        return true;
    }
}