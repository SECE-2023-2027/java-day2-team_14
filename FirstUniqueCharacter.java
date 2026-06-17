import java.util.HashMap;

public class FirstUniqueCharacter {

    public static int firstUniqueChar(String str) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        String str = "wresource";

        int index = firstUniqueChar(str);

        System.out.println("Original String: " + str);
        System.out.println("First unique character of the above: " + index);
    }
}
