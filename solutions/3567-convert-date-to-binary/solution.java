class Solution {
    public String convertDateToBinary(String date) {
        return Arrays.stream(date.split("-"))
            .map(Integer::parseInt)
            .map(Integer::toBinaryString)
            .collect(Collectors.joining("-"));
    }
}
