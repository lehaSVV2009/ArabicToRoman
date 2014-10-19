package com.kadet.numberTransformer.transformer;

import com.kadet.numberTransformer.util.Strings;

/**
 * Date: 19.10.14
 * Time: 16:33
 *
 * @author Kadet
 */
public abstract class ArabicToRomanTransformer implements Transformer<String, Integer> {

    protected void validateArabic (int arabic) {
        if (arabic < 1 || arabic > 3999) {
            throw new IllegalArgumentException(arabic + Strings.NOT_VALID_NUMBER_EXCEPTION + Strings.MUST_BE_FROM_ONE_TO_FOUR_THOUSANDS);
        }
    }


    /**
     *  Append roman symbols to result @roman if @number is part of @arabic
     *  and return remaining number to be transformed later
     *
     * @param arabic        Number to transform
     * @param number        For checking on part of @arabic
     * @param romanSymbol   Roman symbol of @number, may be inserted to @roman
     * @param roman         Result (roman symbols)
     *
     * @return              remaining number to be transformed then
     */
    protected int appendRomanSymbols (int arabic, int number, String romanSymbol, StringBuilder roman) {
        int remaining = arabic;
        while (remaining >= number) {
            roman.append(romanSymbol);
            remaining -= number;
        }
        return remaining;
    }

}
