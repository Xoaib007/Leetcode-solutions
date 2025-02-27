import java.util.*;

class Solution {
    public String tictactoe(int[][] moves) {
        List<int[]> movesListA = new ArrayList<>();
        List<int[]> movesListB = new ArrayList<>();

        // All possible winning sequences (rows, columns, and diagonals)
        int[][][] winSequence = {
            {{0,0}, {0,1}, {0,2}},  // Row 1
            {{1,0}, {1,1}, {1,2}},  // Row 2
            {{2,0}, {2,1}, {2,2}},  // Row 3
            {{0,0}, {1,0}, {2,0}},  // Column 1
            {{0,1}, {1,1}, {2,1}},  // Column 2
            {{0,2}, {1,2}, {2,2}},  // Column 3
            {{0,0}, {1,1}, {2,2}},  // Diagonal 1
            {{2,0}, {1,1}, {0,2}}   // Diagonal 2
        };

        // Separate moves between Player A and Player B
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 1) {
                movesListB.add(moves[i]); // Player B's move (odd index)
            } else {
                movesListA.add(moves[i]); // Player A's move (even index)
            }
        }

        // Check if Player A or Player B has won
        if (checkWin(movesListA, winSequence)) {
            return "A";
        } else if (checkWin(movesListB, winSequence)) {
            return "B";
        } else if (moves.length < 9) {
            return "Pending"; // Game is not finished
        } else {
            return "Draw"; // No winner and all moves are used
        }
    }

    // Checks if a player has a winning sequence
    public static boolean checkWin(List<int[]> movesList, int[][][] winSequence) {
        for (int[][] sequence : winSequence) {
            boolean isWinning = true;
            for (int[] move : sequence) {
                if (!containsMove(movesList, move)) {
                    isWinning = false;
                    break;
                }
            }
            if (isWinning) return true; // Winning sequence found
        }
        return false; // No winning sequence found
    }

    // Checks if a given move exists in the player's move list
    private static boolean containsMove(List<int[]> movesList, int[] move) {
        for (int[] m : movesList) {
            if (Arrays.equals(m, move)) {
                return true;
            }
        }
        return false;
    }
}
