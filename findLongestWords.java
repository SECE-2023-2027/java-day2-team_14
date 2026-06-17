import java.util.ArrayList;
import java.util.List;

public class LongestWordsInDictionary {

    public static List<String> findLongestWords(String[] words) {
        List<String> result = new ArrayList<>();

        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        for (String word : words) {
            if (word.length() == maxLength) {
                result.add(word);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] words1 = {
                "cat",
                "flag",
                "green",
                "country",
                "w3resource"
        };

        String[] words2 = {
                "cat",
                "dog",
                "red",
                "is",
                "am"
        };

        System.out.println("Example 1:");
        System.out.println("Longest word(s): " + findLongestWords(words1));

        System.out.println("\nExample 2:");
        System.out.println("Longest word(s): " + findLongestWords(words2));
    }
}
