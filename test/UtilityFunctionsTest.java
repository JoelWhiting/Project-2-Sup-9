import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class UtilityFunctionsTest {

    @Test
    public void testGetEvenNumbers() {
        assertEquals(Arrays.asList(2, 4, 6), UtilityFunctions.getEvenNumbers(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO WORLD", UtilityFunctions.toUpperCase("hello world"));
    }

    @Test
    public void testGetLongestString() {
        assertEquals("longestString", UtilityFunctions.getLongestString(Arrays.asList("short", "medium", "longestString")));
    }
}
