import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Reverses the order of words in a given string while preserving spaces between words.
     *
     * @param s The input string containing words separated by spaces.
     * @return The string with words in reversed order.
     */
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>(); // List to store extracted words
        StringBuilder word = new StringBuilder(); // StringBuilder for efficient word building

        // Extract words from the input string
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                word.append(c);
            } else if (word.length() > 0) {
                words.add(word.toString()); // Store completed word
                word.setLength(0); // Reset StringBuilder for next word
            }
        }

        // Add the last word if it exists
        if (word.length() > 0) {
            words.add(word.toString());
        }

        // Build the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            reversedSentence.append(words.get(i));
            if (i > 0) reversedSentence.append(" "); // Add space between words
        }

        return reversedSentence.toString();
    }
}
