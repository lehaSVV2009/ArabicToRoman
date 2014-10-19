package com.kadet.numberTransformer.transformer;

import org.junit.Before;
import org.junit.Test;

/**
 * Date: 19.10.14
 * Time: 17:27
 *
 * @author Кадет
 */
public class FlexibleArabicToRomanTest extends ArabicToRomanTest {

    @Before
    public void setUp () throws Exception {
        transformer = new FlexibleArabicToRomanTransformer();
        ((FlexibleArabicToRomanTransformer)transformer).addArabicRoman(5000, "S");
        ((FlexibleArabicToRomanTransformer)transformer).addArabicRoman(10000, "Q");
    }

    @Test
    public void fiveThousandsAndThreeHundreds () {
        assertRoman(5300, "SCCC");
    }

    @Test
    public void twentyNineThousandsAndOne () {
        assertRoman(29001, "QQSMMMMI");
    }

    @Test
    public void threeThousandsAndSeventyThree () {
        assertRoman(3073, "MMMLXXIII");
    }

}
