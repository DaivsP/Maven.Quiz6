package rocks.zipcode.io.fundamentals;

import java.util.HashMap;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        return string.replaceAll("[AaEeIiOoUu]", "");
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        StringBuilder sb = new StringBuilder(string);
        HashMap<Character, Integer> table = new HashMap<>();

        for (int i = 0; i < charactersToRemove.length(); i++) {
            table.put(charactersToRemove.charAt(i), 1);
        }

        int p = 0;
        for (int i = 0; i < string.length(); i++) {
            if (table.containsKey(string.charAt(i))){
                if (p == 0){
                    sb.deleteCharAt(i);
                }
                else {
                    sb.deleteCharAt(i - p);
                }
                p++;
            }
        }
        return sb.toString();
    }
}
