package rocks.zipcode.io.fundamentals;


import com.google.common.collect.Sets;
import rocks.zipcode.io.arrays.ArrayUtils;
import rocks.zipcode.io.collections.PowerSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        // get length of string
        // get range of length
        // get power-set of range
        // for every set in power-set
        // uppercase indices of string using set
        Collection<String> output = new ArrayList<>();
        Integer length = string.length();
        PowerSet<Integer> powerSet = new PowerSet(ArrayUtils.getRange(0, length-1));
        powerSet.permute().forEach(set -> output.add(upperCaseIndices(string, set.toArray(new Integer[0]))));
        return output;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        for (int i = 0; i < indices.length; i++) {
            string = string.replace(string.charAt(indices[i]), Character.toUpperCase(string.charAt(indices[i])));
        }
        return string;
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuilder sb = new StringBuilder(stringToBeManipulated);
        sb.insert(index, valueToBeInserted);
        return sb.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder sb = new StringBuilder(stringToBeManipulated);
        sb.replace(index, index + 1, replacementValue.toString());
        return sb.toString();
    }
}