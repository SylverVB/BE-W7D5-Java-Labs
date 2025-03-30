package WordCount;

public class ReturnWordCount {
    /**
     * Counts the number of words in a given string.
     * 
     * @param in A String representing a sentence, with words separated by spaces.
     * @return The number of words in the string.
     */
    public int count(String in) {
        if (in == null || in.trim().isEmpty()) {
            return 0; // Handle null or empty string edge case
        }
        // Split the string by spaces and count the non-empty segments
        String[] words = in.trim().split("\\s+"); // "\\s+" handles multiple spaces
        // System.out.println(Arrays.toString(words));
        return words.length;
    }
}