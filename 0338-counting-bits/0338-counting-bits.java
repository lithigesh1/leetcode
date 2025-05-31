class Solution {
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for(int i=0; i<n+1; i++){
            bits[i] = bits[i/2] + i%2;
        }
        return bits;
    }
}
