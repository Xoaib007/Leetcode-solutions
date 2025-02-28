class Solution {
    /**
     * Calculates the average salary excluding the minimum and maximum salaries.
     * 
     * - Finds the minimum and maximum salaries in the array.
     * - Sums up the salaries excluding the min and max.
     * - Computes and returns the average.
     *
     * @param salary The array of salaries.
     * @return The average salary excluding the minimum and maximum.
     */
    public double average(int[] salary) {
        double max = salary[0];
        double min = salary[0];

        // Find the minimum and maximum salaries
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
            if (salary[i] < min) {
                min = salary[i];
            }
        }

        double sum = 0;
        double count = 0;

        // Sum all salaries excluding the min and max
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] != max && salary[i] != min) {
                sum += salary[i];
                count++;
            }
        }

        // Return the computed average
        return sum / count;
    }
}
