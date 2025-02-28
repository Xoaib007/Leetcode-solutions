class Solution {
    /**
     * Determines if a robot, given movement instructions, remains within a bounded circle.
     * 
     * The robot starts at (0,0) facing North and follows:
     * - 'G' -> Moves forward
     * - 'L' -> Turns left (90° counterclockwise)
     * - 'R' -> Turns right (90° clockwise)
     *
     * @param instructions A string containing movement instructions ('G', 'L', 'R').
     * @return             True if the robot is bounded in a circle, otherwise false.
     */
    public boolean isRobotBounded(String instructions) {
        char[] movesArray = instructions.toCharArray();
        int x = 0, y = 0; // Robot's position on a 2D plane
        int direction = 0; // Initial direction (0° -> facing North)

        // Process each instruction
        for (char move : movesArray) {
            if (move == 'L') {
                direction += 90; // Turning left (counterclockwise)
            } 
            if (move == 'R') {
                direction -= 90; // Turning right (clockwise)
            } 
            if (move == 'G') {
                // Move in the current direction
                if (direction % 360 == 0) {
                    y += 1;  // Move North
                } else if (direction % 360 == 90 || direction % 360 == -270) {
                    x -= 1;  // Move West
                } else if (direction % 360 == 180 || direction % 360 == -180) {
                    y -= 1;  // Move South
                } else if (direction % 360 == 270 || direction % 360 == -90) {
                    x += 1;  // Move East
                }
            }
        }

        // If the robot returns to (0,0), it's bounded in a circle
        if (x == 0 && y == 0) {
            return true;
        }

        // If the robot does not face North after the sequence, it will cycle and be bounded
        return direction % 360 != 0;
    }
}
