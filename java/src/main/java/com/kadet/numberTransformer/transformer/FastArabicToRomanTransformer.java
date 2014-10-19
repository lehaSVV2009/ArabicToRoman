package com.kadet.numberTransformer.transformer;

/**
 * Date: 19.10.14
 * Time: 15:19
 * <p/>
 * A FastArabicToRomanTransformer transforms arabic numbers to roman figures
 *
 * @author Kadet
 */
public class FastArabicToRomanTransformer extends ArabicToRomanTransformer {

    /**
     * Order is necessary
     */
    private static int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] ROMAN_SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    /**
     * Transform from integer arabic number to roman symbols
     * Arabic numbers must be in the range of 1 to 3999
     *
     * @param arabic integer number
     * @return roman string
     */
    @Override
    public String transform (Integer arabic) {
        validateArabic(arabic);
        StringBuilder roman = new StringBuilder();
        int remaining = arabic;
        for (int numberIndex = 0; numberIndex < NUMBERS.length; ++numberIndex) {
            remaining = appendRomanSymbols(remaining, NUMBERS[numberIndex], ROMAN_SYMBOLS[numberIndex], roman);
        }
        return roman.toString();
    }


}
