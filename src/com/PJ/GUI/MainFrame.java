package com.PJ.GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame implements MainFrameShop {

    public StartPanel startPanel;

    public MainFrame(){

        super("Beauty shop");
        StartListener listener = new StartListener(this);
        startPanel = new StartPanel(listener);

        add(startPanel);

        setPreferredSize(new Dimension(750, 770));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

}
