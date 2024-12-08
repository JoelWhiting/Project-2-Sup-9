import java.util.List;
import java.util.ArrayList;

public class UtilityFunctions {

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> evens = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        return evens;
    }

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

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
