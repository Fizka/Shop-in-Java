package com.PJ.GUI;

import com.PJ.Database.SelectStatement;
import com.PJ.Objects.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.List;


public class BusketPanel extends JPanel implements  MainFrameShop {

    private final JFrame mainFrame;

    private JLabel idUser;
    private JLabel basketTotals;
    private JLabel itemsTotals;

    private int iteracja = 10;
    private int intQuantity = 1;
    private int intTotals = 99;

    private String Username = "Admin";

    private JButton  cancelbutton [][];
    private JButton buttoncheckout;

    private JPanel mainPanel;
    private JPanel ItemsPanel;
    private JPanel logoPanel;
    private JPanel userDatePanel;

    private JTextArea temp;

    private JScrollPane scrollpanel;

    private String  my[] = new String[iteracja];

    //userid do konstruktora, quantity z bazy, cena z funkcji + baza, dane produktów z bazy
    SelectStatement date = new SelectStatement();
    List<Product> productList = date.selectProduct();
    List<Inventory> inventoryList = date.selectInventory();
    List<Basket> basketList = date.selectBusket();
    List<Order> orderList = date.selectOrder();

    Product dataProduct;
    Inventory dataInventory;
    Basket dataBasket;
    Order dataOrder;

    BusketPanel(JFrame mainFrame){

        this.mainFrame = mainFrame;
        createComponets();

    }

    void createComponets(){

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(frameSize));
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setBorder(new EmptyBorder(0,20,20,20));

        logoPanel = new MiniLogoPanel(mainFrame);
        logoPanel.setPreferredSize(new Dimension(700, 120));

        ItemsPanel = new JPanel();
        ItemsPanel.setPreferredSize(new Dimension(700, 800));
        ItemsPanel.setBackground(Color.LIGHT_GRAY);
        ItemsPanel.setLayout(new GridLayout(iteracja,2, 10, 0));
        ItemsPanel.setBorder(new EmptyBorder(30, 30, 30, 10));

        cancelbutton = new JButton[iteracja][3];

        userDatePanel = new JPanel();
        userDatePanel.setPreferredSize(new Dimension(700, 50));
        userDatePanel.setBackground(Color.LIGHT_GRAY);
        userDatePanel.setLayout(new GridLayout(1,4,10, 10));
        userDatePanel.setBorder(new EmptyBorder(10,10,10,10));

        buttoncheckout = new JButton("Checkout");
        buttoncheckout.setBackground(Color.GRAY);
        buttoncheckout.setFont(myFont);

        idUser = new JLabel("Username : " + Username);
        idUser.setFont(myFonttwo);
        idUser.setHorizontalAlignment(SwingConstants.CENTER);
        idUser.setVerticalAlignment(SwingConstants.CENTER);
        idUser.setForeground(Color.black);

        basketTotals = new JLabel("Totals : "  + intTotals);
        basketTotals.setFont(myFonttwo);
        basketTotals.setHorizontalAlignment(SwingConstants.CENTER);
        basketTotals.setVerticalAlignment(SwingConstants.CENTER);
        basketTotals.setForeground(Color.black);

        itemsTotals = new JLabel("Quantity : " + intQuantity);
        itemsTotals.setFont(myFonttwo);
        itemsTotals.setHorizontalAlignment(SwingConstants.CENTER);
        itemsTotals.setVerticalAlignment(SwingConstants.CENTER);
        itemsTotals.setForeground(Color.black);

        userDatePanel.add(idUser);
        userDatePanel.add(basketTotals);
        userDatePanel.add(itemsTotals);
        userDatePanel.add(buttoncheckout);

        for(int i =0; i<iteracja; i++) {

            for(int j=0; j<3; j++) {

                cancelbutton[i][j] = new JButton();
                cancelbutton[i][j].setPreferredSize(new Dimension(5, 5));
                cancelbutton[i][j].setBackground(Color.GRAY);
                cancelbutton[i][j].setForeground(Color.black);

            }

            cancelbutton[i][0].setText("Drop");
            cancelbutton[i][1].setText("Add");
            cancelbutton[i][2].setText("Remove");

            my[i] = "Fuck You, fuck you, fuck you, fuck you! \t\n Fuck You, fuck you, fuck you, fuck you!";

        }

        for(int i =0; i<iteracja; i++) {

            JPanel panelbutton = new JPanel(new GridLayout(1, 3, 10,10));
            panelbutton.setBorder(new EmptyBorder(20,20,20,20));
            panelbutton.setBackground(Color.LIGHT_GRAY);
            temp =  new JTextArea( my[i]);
            temp.append(my[i]);
            temp.setBackground(Color.LIGHT_GRAY);
            temp.setFont(myFonttwo);
            temp.setEditable(false);
            temp.setBorder(new EmptyBorder(5, 5, 5, 5));
            ItemsPanel.add(temp);
            panelbutton.add(cancelbutton[i][0]);
            panelbutton.add(cancelbutton[i][1]);
            panelbutton.add(cancelbutton[i][2]);
            ItemsPanel.add(panelbutton);
        }



        scrollpanel = new JScrollPane(ItemsPanel,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollpanel.setPreferredSize(new Dimension(700,480));
        scrollpanel.setBounds(0, 0, 700, 480);
        scrollpanel.setBackground(Color.LIGHT_GRAY);

        mainPanel.add(logoPanel);
        mainPanel.add(userDatePanel);
        mainPanel.add(scrollpanel);

        add(mainPanel);

    }

}
