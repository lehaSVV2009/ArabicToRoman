package com.kadet.numberTransformer.transformer;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 19.10.14
 * Time: 17:42
 *
 * @author Kadet
 */
public abstract class ArabicToRomanTest {

    protected ArabicToRomanTransformer transformer;

    protected void assertRoman (int arabic, String expectedRoman) {
        Assert.assertEquals(expectedRoman, transformer.transform(arabic));
    }

    @Test
    public void one () {
        assertRoman(1, "I");
    }

    @Test
    public void two () {
        assertRoman(2, "II");
    }

    @Test
    public void four () {
        assertRoman(4, "IV");
    }

    @Test
    public void five () {
        assertRoman(5, "V");
    }

    @Test
    public void six () {
        assertRoman(6, "VI");
    }

    @Test
    public void nine () {
        assertRoman(9, "IX");
    }

    @Test
    public void twelve () {
        assertRoman(12, "XII");
    }

    @Test
    public void twenty () {
        assertRoman(20, "XX");
    }

    @Test
    public void thousandAndHundred () {
        assertRoman(1100, "MC");
    }

    @Test
    public void fourHundredsThirtyFour () {
        assertRoman(434, "CDXXXIV");
    }

    @Test
    public void fourHundredsAndFiftySeven () {
        assertRoman(457, "CDLVII");
    }


}
