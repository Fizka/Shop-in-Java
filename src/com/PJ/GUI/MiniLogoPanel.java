package com.PJ.GUI;

import com.PJ.GUI.*;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniLogoPanel extends JPanel implements MainFrameShop {

    private final JFrame frame;

    private JButton buttonCustomerConto;
    private JButton buttonCustomerbasket;
    private JButton buttonHelp;
    private JButton buttonInventoryShop;

    private ImageIcon imageCustomerConto;
    private ImageIcon imageCustomerbasket;
    private ImageIcon imageHelp;
    private ImageIcon imageInventoryShop;

    private JPanel mainPanel;

    MiniLogoPanel(JFrame frame)
    {
        this.frame = frame;
        createPanels();

    }

    void createPanels(){


        imageCustomerConto = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\userlogo.png");
        buttonCustomerConto = new JButton();
        buttonCustomerConto.setIcon(imageCustomerConto);
        buttonCustomerConto.setBackground(Color.LIGHT_GRAY);
        buttonCustomerConto.addActionListener(new ActionListenerCustomer());

        imageCustomerbasket = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\shoppingcart.png");
        buttonCustomerbasket = new JButton();
        buttonCustomerbasket.setIcon(imageCustomerbasket);
        buttonCustomerbasket.setBackground(Color.LIGHT_GRAY);
        buttonCustomerbasket.addActionListener(new ActionListenerBusket());

        imageHelp = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\global.png");
        buttonHelp = new JButton();
        buttonHelp.setIcon(imageHelp);
        buttonHelp.setBackground(Color.LIGHT_GRAY);
        buttonHelp.addActionListener( new ActionListenerServer());

        imageInventoryShop = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\cosmetics.png");
        buttonInventoryShop = new JButton();
        buttonInventoryShop.setIcon(imageInventoryShop);
        buttonInventoryShop.setBackground(Color.LIGHT_GRAY);
        buttonInventoryShop.addActionListener(new MiniLogoListener(frame));

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

        class ActionListenerCustomer implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {

                        JPanel customerP = new CustomerPanel( frame);

                        frame.getContentPane().removeAll();
                        frame.add(customerP);
                        frame.validate();
                    }
                });
            }

        }

    class ActionListenerServer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    JPanel customerP = new CustomerPanel( frame);

                    frame.getContentPane().removeAll();
                    frame.add(customerP);
                    frame.validate();
                }
            });
        }

    }

    class ActionListenerBusket implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    JPanel busketP = new BusketPanel( frame);

                    frame.getContentPane().removeAll();
                    frame.add(busketP);
                    frame.validate();
                }
            });
        }

    }
}
