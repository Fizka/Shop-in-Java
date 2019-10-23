package com.PJ;

import javax.swing.*;

public class Frame extends JFrame implements MainFrameShop{

    public StartPanel startPanel;

    public Frame(){

        super("Beauty shop");
        StartListener listener = new StartListener(this);
        startPanel = new StartPanel(listener);

        add(startPanel);

        setPreferredSize(frameSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

}
