import java.util.*;

class Solution {
    /**
     * Determines the result of a Tic-Tac-Toe game based on the given moves.
     *
     * @param moves A list of moves where moves[i] = [row, col] representing the ith move.
     * @return      "A" if Player A wins, "B" if Player B wins, "Draw" if no winner,
     *              or "Pending" if the game is not yet finished.
     */
    public String tictactoe(int[][] moves) {
        List<int[]> movesListA = new ArrayList<>(); // Stores Player A's moves
        List<int[]> movesListB = new ArrayList<>(); // Stores Player B's moves

        // Define all possible winning sequences (rows, columns, and diagonals)
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
            return "A"; // Player A wins
        } else if (checkWin(movesListB, winSequence)) {
            return "B"; // Player B wins
        } else if (moves.length < 9) {
            return "Pending"; // Game is still in progress
        } else {
            return "Draw"; // No winner, all moves played
        }
    }

    /**
     * Checks if a player's moves match any winning sequence.
     *
     * @param movesList   The player's list of moves.
     * @param winSequence The predefined winning sequences.
     * @return            True if the player has a winning sequence, false otherwise.
     */
    private static boolean checkWin(List<int[]> movesList, int[][][] winSequence) {
        for (int[][] sequence : winSequence) {
            boolean isWinning = true;
            for (int[] move : sequence) {
                if (!containsMove(movesList, move)) {
                    isWinning = false; // If any move is missing, this is not a winning sequence
                    break;
                }
            }
            if (isWinning) return true; // A winning sequence is found
        }
        return false; // No winning sequence found
    }

    /**
     * Checks if a given move exists in the player's move list.
     *
     * @param movesList The player's list of moves.
     * @param move      The move to check.
     * @return          True if the move is in the list, false otherwise.
     */
    private static boolean containsMove(List<int[]> movesList, int[] move) {
        for (int[] m : movesList) {
            if (Arrays.equals(m, move)) {
                return true; // Move found in the list
            }
        }
        return false; // Move not found
    }
}
