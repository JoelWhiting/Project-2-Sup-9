import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> strings = Arrays.asList("short", "medium", "longestString");

        System.out.println("Even Numbers: " + UtilityFunctions.getEvenNumbers(numbers));
        System.out.println("Uppercase String: " + UtilityFunctions.toUpperCase("hello world"));
        System.out.println("Longest String: " + UtilityFunctions.getLongestString(strings));
    }
}
