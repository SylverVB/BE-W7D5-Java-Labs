package ContainsDuplicatesLab;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determines whether an array contains duplicate values.
     * Uses a Set to check for duplicates as Sets do not allow duplicate values.
     *
     * @param nums An array of integers.
     * @return true if the array contains any duplicate values, false otherwise.
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num); // Add the number to the set
        }
        return false; // No duplicates found
    }
}