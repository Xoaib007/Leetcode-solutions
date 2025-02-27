class Solution {
    /**
     * Evaluates a list of baseball game operations and returns the final score.
     *
     * @param operations An array of strings representing operations.
     * @return The final calculated score.
     */
    public int calPoints(String[] operations) {
        LinkedList<Integer> newList = new LinkedList<>();

        for (int i = 0; i < operations.length; i++) {
            // Check if the operation is a number
            if (operations[i].matches("-?\\d+")) {
                newList.addLast(Integer.valueOf(operations[i]));
            }
            // '+' operation: Sum the last two scores
            else if (operations[i].equals("+") && newList.size() > 1) {
                newList.addLast(newList.getLast() + newList.get(newList.size() - 2));
            }
            // 'D' operation: Double the last score
            else if (operations[i].equals("D") && !newList.isEmpty()) {
                newList.addLast(newList.getLast() * 2);
            }
            // 'C' operation: Remove the last score
            else if (operations[i].equals("C") && !newList.isEmpty()) {
                newList.removeLast();
            }
        }

        // Calculate the final score
        int score = 0;
        for (int num : newList) {
            score += num;
        }

        return score;
    }
}
