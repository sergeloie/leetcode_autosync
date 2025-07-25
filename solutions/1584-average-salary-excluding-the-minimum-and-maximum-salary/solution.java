class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        double sum = 0; 
        for (int sal : salary) {
            min = Math.min(min, sal);
            max = Math.max(max, sal);
            sum += sal;
        }
        return (sum - min - max) / (salary.length - 2);
    }
}
