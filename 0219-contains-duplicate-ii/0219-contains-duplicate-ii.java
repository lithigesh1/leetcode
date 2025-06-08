class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mapInt = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(mapInt.containsKey(nums[i]) && i - mapInt.get(nums[i]) <= k){
                return true;
            }
            mapInt.put(nums[i],i);
        }
        return false;
    }
}