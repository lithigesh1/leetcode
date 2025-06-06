class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> numFreq = new HashMap<>();

        int count =0;
        
        for(int num : nums){
            if(numFreq.containsKey(num)){
                count += numFreq.get(num);
                numFreq.put(num,numFreq.get(num)+1);
            }else{
                numFreq.put(num,1);
            }
        }
        return count;
    }
}