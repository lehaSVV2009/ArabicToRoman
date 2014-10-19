package com.kadet.numberTransformer.controller;

import com.kadet.numberTransformer.service.ArabicToRomanService;
import com.kadet.numberTransformer.view.MainFrame;

/**
 * Date: 19.10.14
 * Time: 21:34
 *
 *  ArabicToRomanController binds view and services, listen to view callings
 *
 * @author Kadet
 */
public class ArabicToRomanController {

    private MainFrame mainFrame;

    private ArabicToRomanService toRomanService;


    public void arabicToRoman (Integer arabic) {
        try {
            String roman = toRomanService.arabicToRoman(arabic);
            mainFrame.update(roman);
        } catch (IllegalArgumentException iae) {
            mainFrame.showException(iae.getMessage());
        }
    }

    public void setMainFrame (MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }


    public void setToRomanService (ArabicToRomanService toRomanService) {
        this.toRomanService = toRomanService;
    }
}
