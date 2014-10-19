package com.kadet.numberTransformer.view;

import com.kadet.numberTransformer.controller.ArabicToRomanController;
import com.kadet.numberTransformer.util.Strings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Date: 19.10.14
 * Time: 21:01
 *
 * @author Kadet
 */
public class MainFrame extends JFrame {

    private ArabicToRomanController controller;

    private static final int width = 400;
    private static final int height = 300;

    private JLabel arabicLabel = new JLabel(Strings.ARABIC_LABEL);
    private JTextField arabicTextField = new JTextField(30);

    private JLabel romanLabel = new JLabel(Strings.ROMAN_LABEL);
    private JTextField romanTextField = new JTextField(30);

    private JLabel exceptionsLabel = new JLabel();
    private JLabel exceptionText = new JLabel();

    public MainFrame () {
        init();
        initComponents();
        addComponents();
    }

    private void init () {
        setTitle(Strings.APP_TITLE);
        setLayout(new FlowLayout());
        setMinimumSize(new Dimension(width, height));
        Dimension dimension
                = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dimension.width / 2 - getSize().width / 2, dimension.height / 2 - getSize().height / 2);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void initComponents () {
        arabicTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased (KeyEvent e) {
                String arabicText = arabicTextField.getText();
                if ("".equals(arabicText)) {
                    update("");
                    return;
                }
                try {
                    int arabic = Integer.parseInt(arabicText);
                    controller.arabicToRoman(arabic);
                } catch (NumberFormatException ne) {
                    showException(arabicText + Strings.NOT_NUMBER_EXCEPTION);
                }
            }
        });
        romanTextField.setEditable(false);
    }


    private void addComponents () {
        add(arabicLabel);
        add(arabicTextField);
        add(romanLabel);
        add(romanTextField);
        add(exceptionsLabel);
        add(exceptionText);
    }


    public void showException (String message) {
        romanTextField.setText("");
        exceptionsLabel.setText(Strings.EXCEPTION_LABEL);
        exceptionText.setText(message);
    }

    public void update(String roman) {
        romanTextField.setText(roman);
        exceptionText.setText("");
        exceptionsLabel.setText("");
    }

    public void setController (ArabicToRomanController controller) {
        this.controller = controller;
    }
}
