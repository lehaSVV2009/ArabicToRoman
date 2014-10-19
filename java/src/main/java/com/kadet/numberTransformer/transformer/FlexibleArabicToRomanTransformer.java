package com.kadet.numberTransformer.transformer;

import com.kadet.numberTransformer.util.Strings;

import java.util.*;

/**
 * Date: 19.10.14
 * Time: 16:32
 *
 *  A FlexibleArabicToRomanTransformer transforms arabic numbers to roman figures
 *  and allows to add new figures
 *
 * @author Kadet
 */
public class FlexibleArabicToRomanTransformer extends ArabicToRomanTransformer {

    private Map<Integer, String> arabicRomanMap = new HashMap<Integer, String>() {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "CM");
        put(1000, "M");
    }};

    /**
     * Allows to expand roman alphabet by new figures
     *
     * @param roman     New figure
     * @param arabic    Arabic number - value of new figure
     */
    public void addArabicRoman (int arabic, String roman) {
        arabicRomanMap.put(arabic, roman);
    }

    /**
     * Transform from integer arabic number to roman symbols
     * Arabic numbers must be more than 1
     *
     * @param arabic    integer number
     * @return roman    string
     */
    @Override
    public String transform (Integer arabic) {
        validateArabic(arabic);
        StringBuilder roman = new StringBuilder();
        List<Integer> arabics
                = getListFromSetWithReverseSorting(arabicRomanMap.keySet());
        int remaining = arabic;
        for (Integer arabicKey : arabics) {
            remaining = appendRomanSymbols(remaining, arabicKey, arabicRomanMap.get(arabicKey), roman);
        }
        return roman.toString();
    }


    private List<Integer> getListFromSetWithReverseSorting (final Set<Integer> set) {
        List<Integer> list = new ArrayList<Integer>() {{
            addAll(set);
        }};
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }


    /**
     *  Validation was overridden cause in this case arabic numbers can be more than 3999
     */
    @Override
    protected void validateArabic (int arabic) {
        if (arabic < 1) {
            throw new IllegalArgumentException(arabic + Strings.NOT_VALID_NUMBER_EXCEPTION + Strings.MUST_BE_FROM_ONE);
        }
    }
}
