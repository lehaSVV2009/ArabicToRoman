package com.kadet.numberTransformer.service;

import com.kadet.numberTransformer.transformer.ArabicToRomanTransformer;

/**
 * Date: 19.10.14
 * Time: 21:53
 *
 * @author Kadet
 */
public class ArabicToRomanServiceImpl implements ArabicToRomanService{

    private ArabicToRomanTransformer transformer;

    @Override
    public String arabicToRoman (Integer arabic) {
        return transformer.transform(arabic);
    }

    @Override
    public void setTransformer (ArabicToRomanTransformer transformer) {
        this.transformer = transformer;
    }
}
