class Solution {
    public boolean isRobotBounded(String instructions) {
        char[] movesArray = instructions.toCharArray();
        int x = 0, y = 0; // Robot's position
        int direction = 0; // Initial direction (0° means facing North)

        for (char move : movesArray) {
            if (move == 'L') {
                direction += 90; // Turning left (counterclockwise)
            } 
            if (move == 'R') {
                direction -= 90; // Turning right (clockwise)
            } 
            if (move == 'G') {
                // Determine movement based on the direction
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

        // If the robot returns to the starting point, it's bounded
        if (x == 0 && y == 0) {
            return true;
        }

        // If the robot is not facing its original direction, it will cycle
        return direction % 360 != 0;
    }
}
