class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        var set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        var set11 = Set.copyOf(set1);
        var set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        set1.removeAll(set2);
        set2.removeAll(set11);

        return List.of(new ArrayList<>(set1), new ArrayList<>(set2));
    }
}
