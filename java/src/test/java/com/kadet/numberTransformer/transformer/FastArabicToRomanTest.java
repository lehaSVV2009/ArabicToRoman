package com.kadet.numberTransformer.transformer;

import org.junit.Before;
import org.junit.Test;

/**
 * Date: 19.10.14
 * Time: 15:24
 *
 * @author Kadet
 */
public class FastArabicToRomanTest extends ArabicToRomanTest {

    @Before
    public void setUp () throws Exception {
        transformer = new FastArabicToRomanTransformer();
    }

    @Test (expected = IllegalArgumentException.class)
    public void fiveThousand () {
        transformer.transform(4000);
    }

}
