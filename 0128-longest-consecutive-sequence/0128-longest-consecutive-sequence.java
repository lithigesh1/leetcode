class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> numMap = new HashMap<>();
        for(int num : nums){
            numMap.put(num, Boolean.FALSE);
        }

        int longest =  0;
        for(int num : nums){
            int currentLongest = 1;

            int nextNum = num+1;
            while(numMap.containsKey(nextNum) && numMap.get(nextNum)==false){
                currentLongest++;
                numMap.put(nextNum, Boolean.TRUE);
                nextNum++;
            }
            
            int prevNum = num-1;
            while(numMap.containsKey(prevNum) && numMap.get(prevNum)==false){
                currentLongest++;
                numMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }
            longest = Math.max(currentLongest,longest);
        }
        return longest;
    }
}