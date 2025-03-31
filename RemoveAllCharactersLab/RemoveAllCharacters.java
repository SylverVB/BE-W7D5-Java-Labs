package RemoveAllCharactersLab;

public class RemoveAllCharacters {
    /**
     * Removes all occurrences of a specified character from a given string.
     * This implementation provides multiple approaches:
     * - Using a for loop with StringBuilder to construct a new string without the character.
     * - Using the replaceAll method of the String class to remove the character.
     * - Using basic string concatenation to build a new string without the character.
     *
     * Documentation for the String class: 
     * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param str A string from which characters will be removed.
     * @param ch A string containing a single character to be removed from str.
     * @return A new string with all occurrences of ch removed.
     * @throws IllegalArgumentException if ch is not a single character.
     */

    // Option 1. Using a for loop:

    public String removeAll(String str, String ch){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ( str.charAt(i) != ch.charAt(0) ) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    // Option 2. Using replaceAll method:

    // public String removeAll(String str, String ch) {
    //     if (ch.length() != 1) {
    //         throw new IllegalArgumentException("Parameter 'ch' must be a single character.");
    //     }
    //     return str.replaceAll(ch, "");
    // }

    // Option 3. Using basic string concatenation:

    // public String removeAll(String str, String ch) {
    //     if (ch.length() != 1) {
    //         throw new IllegalArgumentException("Parameter 'ch' must be a single character.");
    //     }
        
    //     String result = "";

    //     for (int i = 0; i < str.length(); i++) {
    //         if (str.charAt(i) != ch.charAt(0)) {
    //             result += str.charAt(i);
    //         }
    //     }
    //     return result;
    // }
}