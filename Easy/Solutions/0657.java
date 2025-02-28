class Solution {
    /**
     * Determines whether a sequence of moves returns a robot to its starting position.
     * 
     * The robot moves based on:
     * - 'R' -> Moves right (x +1)
     * - 'L' -> Moves left (x -1)
     * - 'U' -> Moves up (y +1)
     * - 'D' -> Moves down (y -1)
     *
     * @param moves A string representing movement instructions ('R', 'L', 'U', 'D').
     * @return      True if the robot returns to the origin, otherwise false.
     */
    public boolean judgeCircle(String moves) {
        int x = 0; // Tracks horizontal movement
        int y = 0; // Tracks vertical movement

        char[] movesArray = moves.toCharArray(); // Convert string to character array

        // Iterate through the character array to update coordinates
        for (char move : movesArray) {
            if (move == 'R') {
                x += 1; // Move right increases x
            } else if (move == 'L') {
                x -= 1; // Move left decreases x
            } else if (move == 'U') {
                y += 1; // Move up increases y
            } else if (move == 'D') {
                y -= 1; // Move down decreases y
            }
        }

        // If the coordinates return to the origin, return true
        return x == 0 && y == 0;
    }
}
