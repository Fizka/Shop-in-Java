package com.PJ.GUI;

import com.PJ.Objects.*;

import java.lang.String;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class InventoryPanel extends JPanel implements MainFrameShop {

    private final JFrame frame;

    //static String[] productName = {"Mydło","Szampon","Krem","Emulsja","Podkład","Szminka"};
    // String[] producentName = {"Ps","Swo","Sob","Emer","Dojo","Ramp"};
    //static String[] description = {"Fajne","Nie kupuj","Może","Coś tu trzeba napisać","Opis","dobre info"};
   // static int[] price = {13,67,69,23,12,78};

    private JButton addToFavoriteButton;
    private JButton addToBusket[];

    private StartListener listener;

    private JScrollPane scrollBarInventoryList;

    private JPanel mainPanel;
    private JPanel itemsPanel;
    private MiniLogoPanel logoPanel;
    private JPanel productPanel;

    private JLabel labelProductName;
    private JLabel labelProducentName;
    private JLabel labelScription;
    private JLabel labelPice;

    private int intPrice[];

    private int intQuantity = 15;

    private String StringProductName[] = new String[intQuantity];
    private String StringProducentName[] = new String[intQuantity];
    private String StringScription[]  = new String[intQuantity];

    java.util.List<Customer> customerList = Main.basedate.selectCustomer();
    java.util.List<Product> productList = Main.basedate.selectProduct();
    java.util.List<Inventory> inventoryList = Main.basedate.selectInventory();
    java.util.List<Shipment> orderList = Main.basedate.selectOrder();
    List<ShopAssistant> basketList = Main.basedate.selectShopAssistant();



    InventoryPanel(StartListener listener, JFrame frame)
    {
        this.frame = frame;
        this.listener = listener;
        CreatePanels();
    }

    private void CreatePanels(){

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(frameSize));
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.LIGHT_GRAY);

        logoPanel = new MiniLogoPanel( frame);
        logoPanel.setPreferredSize(new Dimension(700, 120));

        itemsPanel = new JPanel();
        itemsPanel.setPreferredSize(new Dimension(700, 1200));
        itemsPanel.setBackground(Color.LIGHT_GRAY);
        itemsPanel.setLayout(new GridLayout(intQuantity, 1, 10, 10));
        itemsPanel.setBorder(new EmptyBorder(10, 20, 10, 20));

        addToBusket = new JButton[intQuantity];

        intPrice = new int[intQuantity];

        for(int i =0; i<intQuantity; i++)
        {
            productPanel = new JPanel();
            productPanel.setLayout(new GridLayout(2, 3,10, 10));
            productPanel.setBorder(new EmptyBorder(5,5,5,5));
            productPanel.setPreferredSize(new Dimension(650, 25));

            addToBusket[i] = new JButton("Buy");
            addToBusket[i].setBackground(Color.GRAY);
            addToBusket[i].setForeground(Color.black);

            StringProductName[i] = "Nazwa";
            StringProducentName[i] = "Producent";
            StringScription[i] = "Order details:";

            labelProductName = new JLabel(StringProductName[i]);
            labelProductName.setFont(myFonttwo);
            labelProductName.setHorizontalAlignment(SwingConstants.CENTER);
            labelProductName.setVerticalAlignment(SwingConstants.CENTER);
            labelProductName.setForeground(Color.black);

            labelProducentName = new JLabel(StringProducentName[i]);
            labelProducentName.setFont(myFonttwo);
            labelProducentName.setHorizontalAlignment(SwingConstants.CENTER);
            labelProducentName.setVerticalAlignment(SwingConstants.CENTER);
            labelProducentName.setForeground(Color.black);

            labelScription = new JLabel(StringScription[i]);
            labelScription.setFont(myFonttwo);
            labelScription.setHorizontalAlignment(SwingConstants.CENTER);
            labelScription.setVerticalAlignment(SwingConstants.CENTER);
            labelScription.setForeground(Color.black);

            labelPice = new JLabel(Integer.toString(intPrice[i]));
            labelPice.setFont(myFonttwo);
            labelPice.setHorizontalAlignment(SwingConstants.CENTER);
            labelPice.setVerticalAlignment(SwingConstants.CENTER);
            labelPice.setForeground(Color.black);

           // labelProductName.setText(StringProductName[i]);
            //labelProducentName.setText(StringProducentName[i]);
            //labelScription.setText(StringScription[i]);
            //labelPice.setText(intPrice[i]);

            productPanel.add(labelProductName);
            productPanel.add(labelPice);
            productPanel.add(addToBusket[i]);
            productPanel.add(labelProducentName);
            productPanel.add(labelScription);

            itemsPanel.add(productPanel);
        }

        scrollBarInventoryList = new JScrollPane(itemsPanel,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollBarInventoryList.setBounds(0, 0, 700, 500);
        scrollBarInventoryList.setPreferredSize(new Dimension(700, 500));

        mainPanel.add(logoPanel, BorderLayout.BEFORE_FIRST_LINE);
        mainPanel.add(scrollBarInventoryList, BorderLayout.CENTER);

        add(mainPanel);

    }

     class OptionPaneExample extends WindowAdapter {
        JFrame f;
        OptionPaneExample(){

            f=new JFrame();
            f.addWindowListener(this);
            f.setSize(300, 300);
            f.setLayout(null);
            f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            f.setVisible(true);
        }

        public void windowClosing(WindowEvent e) {
            int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
            if(a==JOptionPane.NO_OPTION){
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            if(a == JOptionPane.YES_OPTION){
                //dodanie do koszyka
            }
        }

    }

}
