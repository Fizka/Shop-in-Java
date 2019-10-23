package com.PJ;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MiniLogoPanel extends JPanel implements MainFrameShop  {


    private JButton buttonCustomerConto;
    private JButton buttonCustomerbasket;
    private JButton buttonHelp;
    private JButton buttonInventoryShop;

    private ImageIcon imageCustomerConto;
    private ImageIcon imageCustomerbasket;
    private ImageIcon imageHelp;
    private ImageIcon imageInventoryShop;

    private JPanel mainPanel;
    private StartListener listener;

    MiniLogoPanel(StartListener listener){
        this.listener = listener;
        createPanels();

    }

    void createPanels(){

         setBackground(Color.LIGHT_GRAY);

        imageCustomerConto = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\userlogo.png");
        buttonCustomerConto = new JButton();
        buttonCustomerConto.setIcon(imageCustomerConto);
        buttonCustomerConto.setBackground(Color.LIGHT_GRAY);

        imageCustomerbasket = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\shoppingcart.png");
        buttonCustomerbasket = new JButton();
        buttonCustomerbasket.setIcon(imageCustomerbasket);
        buttonCustomerbasket.setBackground(Color.LIGHT_GRAY);

        imageHelp = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\global.png");
        buttonHelp = new JButton();
        buttonHelp.setIcon(imageHelp);
        buttonHelp.setBackground(Color.LIGHT_GRAY);

        imageInventoryShop = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\cosmetics.png");
        buttonInventoryShop = new JButton();
        buttonInventoryShop.setIcon(imageInventoryShop);
        buttonInventoryShop.setBackground(Color.LIGHT_GRAY);

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(700, 120));
        mainPanel.setLayout(new GridLayout(1,7,20,20));
        mainPanel.setBorder(new EmptyBorder(20,100,20,100));
        mainPanel.setBackground(Color.DARK_GRAY);

        mainPanel.add(buttonInventoryShop);
        mainPanel.add(buttonCustomerbasket);
        mainPanel.add(buttonCustomerConto);
        mainPanel.add(buttonHelp);

        add(mainPanel);

    }
}
