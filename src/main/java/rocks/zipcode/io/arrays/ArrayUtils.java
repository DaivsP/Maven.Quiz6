package rocks.zipcode.io.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 24/01/2019.
 */
public class ArrayUtils {
    /**
     * @param start - value to begin counting
     * @param end   - value to stop counting
     * @return array of all integers between `start` and `stop`
     */
    public static Integer[] getRange(Integer start, Integer end) {
        List<Integer> rangeList = new ArrayList<>();
        while (start <= end){
            rangeList.add(start);
            start++;
        }
        return rangeList.toArray(new Integer[0]);
    }

    /**
     * @param array - array to be unboxed
     * @return array with identical contents in primitive-array form
     */
    public static char[] unbox(Character[] array) {
        char[] chars = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            chars[i] = array[i];
        }
        return chars;
    }

    /**
     * @param array - array to be boxed
     * @return array with identical contents in nonprimitive-array form
     */
    public static Character[] box(char[] array) {
        Character[] characters = new Character[array.length];
        for (int i = 0; i < array.length; i++) {
            characters[i] = array[i];
        }
        return characters;
    }
}
