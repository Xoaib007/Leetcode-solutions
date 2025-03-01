class Solution {
    /**
     * Determines if all given points lie on a straight line.
     *
     * @param coordinates 2D array where each element is [x, y] representing a point.
     * @return true if all points lie on a straight line, otherwise false.
     */
    public boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0], y0 = coordinates[0][1]; // First point
        int x1 = coordinates[1][0], y1 = coordinates[1][1]; // Second point

        // Check for each point if it satisfies the line equation
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0], y = coordinates[i][1];

            // Cross multiplication to check slope equality: (y - y0) / (x - x0) == (y1 - y0) / (x1 - x0)
            if ((y - y0) * (x1 - x0) != (y1 - y0) * (x - x0)) {
                return false;
            }
        }

        return true; // All points satisfy the equation → straight line
    }
}
