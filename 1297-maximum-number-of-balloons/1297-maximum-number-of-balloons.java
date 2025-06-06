class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> countInput = new HashMap<>();
        for(char c : text.toCharArray()){
            countInput.put(c,countInput.getOrDefault(c,0)+1);
        }

        Map<Character, Integer> countBalloon = new HashMap<>();
        for(char c : "balloon".toCharArray()){
            countBalloon.put(c, countBalloon.getOrDefault(c,0)+1);
        }

        int res = Integer.MAX_VALUE;
        for(char c : countBalloon.keySet()){
            int count = countInput.getOrDefault(c,0);
            int req = countBalloon.getOrDefault(c,0);
            res = Math.min(res, count/req);
        }
        return res;
    }
}