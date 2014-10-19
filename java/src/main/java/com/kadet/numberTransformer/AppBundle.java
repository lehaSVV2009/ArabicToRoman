package com.kadet.numberTransformer;

import com.kadet.numberTransformer.controller.ArabicToRomanController;
import com.kadet.numberTransformer.service.ArabicToRomanService;
import com.kadet.numberTransformer.service.ArabicToRomanServiceImpl;
import com.kadet.numberTransformer.transformer.FastArabicToRomanTransformer;
import com.kadet.numberTransformer.view.MainFrame;

/**
 * Date: 19.10.14
 * Time: 21:17
 *
 * @author Kadet
 */
public class AppBundle {

    public AppBundle () {

        ArabicToRomanController controller = new ArabicToRomanController();

        ArabicToRomanService toRomanService = new ArabicToRomanServiceImpl();

        FastArabicToRomanTransformer transformer = new FastArabicToRomanTransformer();

        MainFrame mainFrame = new MainFrame();

        toRomanService.setTransformer(transformer);

        controller.setToRomanService(toRomanService);
        controller.setMainFrame(mainFrame);

        mainFrame.setController(controller);
        mainFrame.setVisible(true);

    }
}
