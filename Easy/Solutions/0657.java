class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        char[] movesArray = moves.toCharArray();

        // Iterate through the character array to update coordinates
        for(int i = 0; i < movesArray.length; i++){
            if(movesArray[i] == 'R'){
                x += 1; // Move right increases x
            }
            if(movesArray[i] == 'L'){
                x -= 1; // Move left decreases x
            }
            if(movesArray[i] == 'U'){
                y += 1; // Move up increases y
            }
            if(movesArray[i] == 'D'){
                y -= 1; // Move down decreases y
            }
        }

        // If the coordinates return to the origin, return true
        return x == 0 && y == 0;
    }
}
