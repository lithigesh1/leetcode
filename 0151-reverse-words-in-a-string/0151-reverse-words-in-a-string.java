class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder rev = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            rev.append(words[i]);
            rev.append(" ");
        }
        return rev.toString().trim(); 
    }
}
