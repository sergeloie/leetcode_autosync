class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<String> jSet = Set.of(jewels.split(""));
        long result = Stream.of(stones.split(""))
                .filter(jSet::contains)
                .count();
        return (int) result;
    }
}
