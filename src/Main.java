import java.util.Arrays;
import java.util.List;

/**
 * Main class to demonstrate the functionality of UtilityFunctions.
 * Contains the entry point of the application.
 * <p>
 * It demonstrates:
 * <ul>
 *     <li>Filtering even numbers from a list</li>
 *     <li>Converting a string to uppercase</li>
 *     <li>Finding the longest string in a list</li>
 * </ul>
 * </p>
 * 
 * @author Joel
 * @version 1.0
 * @since 2024-06-07
 */
public class Main {

    /**
     * The main method serves as the entry point for the program.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> strings = Arrays.asList("short", "medium", "longestString");

        // Demonstrating UtilityFunctions
        System.out.println("Even Numbers: " + UtilityFunctions.getEvenNumbers(numbers));
        System.out.println("Uppercase String: " + UtilityFunctions.toUpperCase("hello world"));
        System.out.println("Longest String: " + UtilityFunctions.getLongestString(strings));
    }
}
