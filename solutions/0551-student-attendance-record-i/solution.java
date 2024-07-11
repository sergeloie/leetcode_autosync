class Solution {
    public boolean checkRecord(String s) {
        boolean latecomer = s.contains("LLL");
        boolean truant = s.indexOf("A") != s.lastIndexOf("A");
        return !latecomer && !truant;
    }
}
