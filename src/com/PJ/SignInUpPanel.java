package com.PJ;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SignInUpPanel extends JPanel implements  MainFrameShop, KeyListener{

    private final JFrame frame;

    private JPanel loginbuttonPanel;
    private JPanel logoPanel;
    private JPanel shopPanel;

    private String userName;
    private String userPassdw;

    public String getUserName()
    {
        return textUserName.getText();
    }

    public String getUserPassdw()
    {
        return textUserPassdw.getText();
    }

    private ImageIcon iconButtonGoBack;
    private ImageIcon iconButtonConfirm;

    private JTextField textUserName;
    private JTextField textUserPassdw;

    private JLabel labelUserName;
    private JLabel labelUserPassdw;

    private JButton buttonConfirm;
    private JButton buttonGoBack;



    public SignInUpPanel(JFrame frame){


        super();
        this.frame = frame;
        CreateComponents();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

    }

    private void CreateComponents(){

        labelUserName = new JLabel("Username: ");
        labelUserName.setFont(myFont);
        labelUserName.setHorizontalAlignment(SwingConstants.CENTER);
        labelUserName.setVerticalAlignment(SwingConstants.CENTER);
        labelUserName.setForeground(Color.black);

        labelUserPassdw = new JLabel("Password: ");
        labelUserPassdw.setFont(myFont);
        labelUserPassdw.setHorizontalAlignment(SwingConstants.CENTER);
        labelUserPassdw.setVerticalAlignment(SwingConstants.CENTER);
        labelUserPassdw.setForeground(Color.black);

        textUserName = new JTextField("Username", 20);
        textUserName.setBackground(Color.GRAY);

        textUserPassdw = new JTextField("Password", 20);
        textUserPassdw.setBackground(Color.GRAY);

        iconButtonConfirm = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\share.png");

        buttonConfirm = new JButton("Confirm");
        buttonConfirm.setIcon(iconButtonConfirm);
        buttonConfirm.setMaximumSize(new Dimension(100, 30));
        buttonConfirm.setSize(new Dimension(100, 20));
        buttonConfirm.setBackground(Color.GRAY);
        buttonConfirm.setFont(myFont);
        buttonConfirm.setForeground(Color.black);
        buttonConfirm.addActionListener(new ConfrimListener());

        iconButtonGoBack = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\backarrow.png");

        buttonGoBack = new JButton();
        buttonGoBack.setIcon(iconButtonGoBack);
        buttonGoBack.setMaximumSize(new Dimension(100, 30));
        buttonGoBack.setSize(new Dimension(100, 20));
        buttonGoBack.setBackground(Color.GRAY);
        buttonGoBack.setFont(myFont);
        buttonGoBack.setForeground(Color.black);
        buttonGoBack.addActionListener(new ConvertListener());

        //MainPanel
        shopPanel = new JPanel();
        shopPanel.setPreferredSize(frameSize);
        shopPanel.setBackground(Color.lightGray);
        shopPanel.setLayout(new GridLayout(2,1));

        logoPanel = new LogoPanel( );
        logoPanel.setBounds(10,10,700,700);
        logoPanel.setMaximumSize(frameSize);

        loginbuttonPanel = new JPanel(new GridLayout(5,2, 20, 20));
        loginbuttonPanel.setBorder(new EmptyBorder(20,100,20,100));
        loginbuttonPanel.setBackground(Color.LIGHT_GRAY);

        loginbuttonPanel.add(labelUserName);
        loginbuttonPanel.add(textUserName);

        loginbuttonPanel.add(labelUserPassdw);
        loginbuttonPanel.add(textUserPassdw);

        loginbuttonPanel.add(buttonGoBack);
        loginbuttonPanel.add(buttonConfirm);


        shopPanel.add(logoPanel);
        shopPanel.add(loginbuttonPanel);

        this.add(shopPanel);
    }


    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            //wejscie
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    class ConvertListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            //zmiany wyglądu wywołujemy w wątku dystrybucji zdarzeń
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    StartListener listener = new StartListener(frame);
                    JPanel startPanel = new StartPanel(listener);
                    frame.getContentPane().removeAll();
                    frame.add(startPanel);
                    frame.validate();
                }
            });
        }
    }

    class ConfrimListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            //zmiany wyglądu wywołujemy w wątku dystrybucji zdarzeń
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    StartListener listener = new StartListener(frame);
                    JPanel miniLogoPanel = new MiniLogoPanel(listener);
                    frame.getContentPane().removeAll();
                    frame.add(miniLogoPanel);
                    frame.validate();
                }
            });
        }
    }
}

