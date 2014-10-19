package com.kadet.numberTransformer.service;

import com.kadet.numberTransformer.transformer.ArabicToRomanTransformer;

/**
 * Date: 19.10.14
 * Time: 21:51
 *
 * @author Kadet
 */
public interface ArabicToRomanService {

    public String arabicToRoman (Integer arabic);

    public void setTransformer (ArabicToRomanTransformer transformer);

}
