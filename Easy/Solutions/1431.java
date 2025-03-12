import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    /**
     * Determines which kids will have the greatest number of candies if they receive extraCandies.
     *
     * @param candies      An array where candies[i] represents the number of candies a kid has.
     * @param extraCandies The number of extra candies that can be given to each kid.
     * @return A list of Booleans where each element indicates if the kid can have the maximum candies.
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Find the maximum number of candies any kid currently has
        int highest = Arrays.stream(candies).max().orElseThrow();

        // Determine if each kid can have the most candies after receiving extraCandies
        for (int candy : candies) {
            // If adding extraCandies makes this kid reach or exceed the highest count
            result.add(candy + extraCandies >= highest);
        }

        return result; // Return the list of results
    }
}
