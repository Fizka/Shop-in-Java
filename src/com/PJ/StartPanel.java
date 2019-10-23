package com.PJ;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;


public class StartPanel extends JPanel implements  MainFrameShop {

    protected static JButton buttonlogin;
    protected static JButton buttonRegister;

    private JPanel buttonPanel;
    private JPanel mainPanel;

    private LogoPanel logoPanel;

    private StartListener listener;

    private  JFrame mainframe;
    private StartPanel startPanel;


    public StartPanel(StartListener listener){

        super();
        this.listener = listener;
        this.listener.setPanel(this);
        createPanel();

    }

    private void createPanel(){

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(frameSize);
        mainPanel.setLayout(new GridLayout(2,1));
        mainPanel.setBackground(Color.LIGHT_GRAY);

        logoPanel = new LogoPanel( );
        logoPanel.setBounds(10,10,700,700);
        logoPanel.setMaximumSize(frameSize);

        buttonlogin = new JButton("Sign in");
        buttonlogin.setMaximumSize(new Dimension(100, 30));
        buttonlogin.setSize(new Dimension(100, 20));
        buttonlogin.setBackground(Color.GRAY);
        buttonlogin.setFont(myFont);
        buttonlogin.setForeground(Color.black);
        buttonlogin.addActionListener(listener);

        buttonRegister = new JButton("Sign up");
        buttonRegister.setMaximumSize(new Dimension(100, 30));
        buttonRegister.setSize(new Dimension(100, 20));
        buttonRegister.setBackground(Color.GRAY);
        buttonRegister.setFont(myFont);
        buttonRegister.setForeground(Color.black);
        buttonRegister.addActionListener(listener);

        buttonPanel = new JPanel(new GridLayout(4,1, 20, 20));
        buttonPanel.setBorder(new EmptyBorder(100,100,20,100));
        buttonPanel.setBackground(Color.LIGHT_GRAY);

        buttonPanel.add(buttonlogin);
        buttonPanel.add(buttonRegister);

        mainPanel.add(logoPanel);
        mainPanel.add(buttonPanel);

        this.add(mainPanel);
    }


}
