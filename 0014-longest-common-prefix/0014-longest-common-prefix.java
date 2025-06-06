class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        for(int i=0; i<first.length; i++){
            if(first[i] != last[i]){
                break;
            }
            prefix.append(first[i]);
        }
        return prefix.toString();
    }
}