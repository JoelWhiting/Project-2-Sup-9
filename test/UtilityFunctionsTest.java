import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the UtilityFunctions class.
 *
 * @author Joel
 * @version 1.0
 * @since 2024-06-07
 */
public class UtilityFunctionsTest {

    /**
     * Tests the getEvenNumbers method.
     * Ensures it correctly filters even numbers from a list.
     */
    @Test
    public void testGetEvenNumbers() {
        assertEquals(Arrays.asList(2, 4, 6), UtilityFunctions.getEvenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    /**
     * Tests the toUpperCase method.
     * Ensures it converts a string to all uppercase characters.
     */
    @Test
    public void testToUpperCase() {
        assertEquals("HELLO WORLD", UtilityFunctions.toUpperCase("hello world"));
    }

    /**
     * Tests the getLongestString method.
     * Ensures it returns the longest string in a list.
     */
    @Test
    public void testGetLongestString() {
        assertEquals("longestString", UtilityFunctions.getLongestString(Arrays.asList("short", "medium", "longestString")));
    }
}
