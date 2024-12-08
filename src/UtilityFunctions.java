import java.util.List;
import java.util.ArrayList;

/**
 * UtilityFunctions provides common utility methods for working with numbers and strings.
 */
public class UtilityFunctions {

    /**
     * Returns a list of all even numbers in the input list.
     *
     * @param numbers List of integers to filter.
     * @return A list containing only even numbers.
     */
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    /**
     * Converts all characters in a string to uppercase.
     *
     * @param input The input string.
     * @return A string with all uppercase characters.
     */
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    /**
     * Returns the longest string from a list of strings.
     *
     * @param strings List of strings to search.
     * @return The longest string in the list.
     */
    public static String getLongestString(List<String> strings) {
        String longest = "";
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }
}
