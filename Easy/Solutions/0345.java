import java.util.ArrayList;
import java.util.List;

class Solution {
    /**
     * Reverses only the vowels in the given string while keeping other characters unchanged.
     *
     * @param s The input string.
     * @return The modified string with vowels reversed.
     */
    public String reverseVowels(String s) {
        List<Character> containingVowels = new ArrayList<>(); // List to store vowels
        StringBuilder sb = new StringBuilder(s); // Mutable version of the string
        
        // First pass: Collect all vowels in order
        for (int i = 0; i < s.length(); i++) {
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) { // Check if character is a vowel
                containingVowels.add(s.charAt(i));
            }
        }

        // Second pass: Replace vowels in reverse order
        for (int i = 0; i < s.length(); i++) {
            if ("AEIOUaeiou".indexOf(s.charAt(i)) != -1) { // Check if character is a vowel
                sb.setCharAt(i, containingVowels.remove(containingVowels.size() - 1)); // Replace with last vowel from list
            }
        }

        return sb.toString(); // Convert StringBuilder back to String and return
    }
}
