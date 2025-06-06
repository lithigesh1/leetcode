class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0, result = 0;
        for (int num : nums) {
            if (num == 0) {
                count++;
                result += count;
            } else {
                count = 0;
            }
        }
        return result;
    }
}
