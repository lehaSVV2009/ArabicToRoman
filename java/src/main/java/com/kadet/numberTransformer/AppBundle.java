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

    /**
     * Init Application
     */
    public AppBundle () {

        // init services
        ArabicToRomanService toRomanService = new ArabicToRomanServiceImpl();
        FastArabicToRomanTransformer transformer = new FastArabicToRomanTransformer();
        toRomanService.setTransformer(transformer);

        // init views
        MainFrame mainFrame = new MainFrame();

        // init controllers
        ArabicToRomanController controller = new ArabicToRomanController();
        controller.setToRomanService(toRomanService);
        controller.setMainFrame(mainFrame);

        // adjust view
        mainFrame.setController(controller);

        // show view
        mainFrame.setVisible(true);

    }
}
