package com.PJ.GUI;

import com.PJ.Database.SelectStatement;
import com.PJ.Objects.*;
import com.PJ.Server.UserValidator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CustomerPanel extends JPanel implements MainFrameShop,ActionListener{

    private final JFrame frame;

    private String ImageProfilepath;

    private String firtsName = "Jan";
    private String lastName = "Kowaliski";
    private String orderString = "Zamowienia, ktore sa realizowane";
    private String informationAccount = "Informacje o kliencie";

    private JLabel labelName;
    private JLabel labelLastName;
    private JLabel labelInformations;
    private JLabel labelOrder;

    private JTextField textInformations;
    private JTextField textOrder;

    private JPanel logoPanel;
    private JPanel mainPanel;
    private JPanel userPanel;
    private JPanel orderPanel;
    private JPanel datePanel;

    SelectStatement date = new SelectStatement();

    List<Product> productList = date.selectProduct();
    List<Basket> basketList = date.selectBusket();
    List<Order> orderList = date.selectOrder();

    Product dataProduct;
    Basket dataBasket;
    Order dataOrder;

    CustomerPanel(JFrame frame){

        this.frame = frame;
        CreatePanels();

    }

    void CreatePanels(){

        firtsName = UserValidator.dateCustomer.getFirstName();
        lastName = UserValidator.dateCustomer.getLastNameString();

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(frameSize));
        mainPanel.setLayout(new GridLayout(3, 1));
        mainPanel.setBackground(Color.LIGHT_GRAY);

        logoPanel = new MiniLogoPanel( frame);
        logoPanel.setPreferredSize(new Dimension(700, 120));
        logoPanel.setBackground(Color.LIGHT_GRAY);

        userPanel = new JPanel();
        userPanel.setPreferredSize(new Dimension(700, 200));
        userPanel.setLayout(new GridLayout(1, 2, 20, 20));
        userPanel.setBorder(new EmptyBorder(0,30,0,0));
        userPanel.setBackground(Color.LIGHT_GRAY);

        datePanel = new JPanel();
        datePanel.setPreferredSize(new Dimension(700, 200));
        datePanel.setLayout(new GridLayout(4, 1, 20, 20));
        datePanel.setBackground(Color.LIGHT_GRAY);

        orderPanel = new JPanel();
        orderPanel.setPreferredSize(new Dimension(700, 200));
        orderPanel.setLayout(new GridLayout(2,2));
        orderPanel.setBorder(new EmptyBorder(20,100,20,100));
        orderPanel.setBackground(Color.LIGHT_GRAY);

        textOrder = new JTextField(orderString, 4);
        textOrder.setEditable(false);
        textOrder.setBackground(Color.GRAY);

        textInformations = new JTextField(informationAccount, 4);
        textInformations.setEditable(false);
        textInformations.setBackground(Color.GRAY);

        labelName = new JLabel("First Name: " + firtsName);
        labelName.setFont(myFonttwo);
        labelName.setHorizontalAlignment(SwingConstants.CENTER);
        labelName.setVerticalAlignment(SwingConstants.CENTER);
        labelName.setForeground(Color.black);

        labelLastName = new JLabel("Last Name: " + lastName);
        labelLastName.setFont(myFonttwo);
        labelLastName.setHorizontalAlignment(SwingConstants.CENTER);
        labelLastName.setVerticalAlignment(SwingConstants.CENTER);
        labelLastName.setForeground(Color.black);

        labelInformations = new JLabel("customer address: Warszawa" );
        labelInformations.setFont(myFonttwo);
        labelInformations.setHorizontalAlignment(SwingConstants.CENTER);
        labelInformations.setVerticalAlignment(SwingConstants.CENTER);
        labelInformations.setForeground(Color.black);

        labelOrder = new JLabel("Basket details: ");
        labelOrder.setFont(myFonttwo);
        labelOrder.setHorizontalAlignment(SwingConstants.CENTER);
        labelOrder.setVerticalAlignment(SwingConstants.CENTER);
        labelOrder.setForeground(Color.black);

        orderPanel.add(labelOrder);
        orderPanel.add(textOrder);

        datePanel.add(labelName);
        datePanel.add(labelLastName);
        datePanel.add(labelInformations);
        datePanel.add(textInformations);

        userPanel.add(datePanel);
        userPanel.add(new JLabel(new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\accwoman.png")));

        mainPanel.add(logoPanel);
        mainPanel.add(userPanel);
        mainPanel.add(orderPanel);

        add(mainPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
