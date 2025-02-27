import java.util.*;

class Solution {
    /**
     * Generates a list of strings representing the FizzBuzz sequence up to n.
     *
     * @param n The upper limit of the FizzBuzz sequence.
     * @return  A list of strings where numbers divisible by 3 are replaced with "Fizz",
     *          numbers divisible by 5 are replaced with "Buzz", and numbers divisible by both
     *          3 and 5 are replaced with "FizzBuzz".
     */
    public List<String> fizzBuzz(int n) {
        List<String> newArray = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            if ((j % 3 == 0) && (j % 5 == 0)) {
                newArray.add("FizzBuzz");
            } else if ((j % 3 == 0) && (j % 5 != 0)) {
                newArray.add("Fizz");
            } else if ((j % 3 != 0) && (j % 5 == 0)) {
                newArray.add("Buzz");
            } else {
                newArray.add(String.valueOf(j));
            }
        }

        return newArray;
    }
}
