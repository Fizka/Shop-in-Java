package com.PJ;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InventoryPanel {

    static String[] productName = {"Mydło","Szampon","Krem","Emulsja","Podkład","Szminka"};
    static String[] producentName = {"Ps","Swo","Sob","Emer","Dojo","Ramp"};
    static String[] description = {"Fajne","Nie kupuj","Może","Coś tu trzeba napisać","Opis","dobre info"};
    static int[] price = {13,67,69,23,12,78};

    private JButton addToFavoriteButton;
    private JButton addToBusket;

    private JScrollBar scrollBarInventoryList;

    InventoryPanel(){

    }

    private void CreatePanels(){

        scrollBarInventoryList = new JScrollBar();
        scrollBarInventoryList.setBounds(200, 40, 600, 800);


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
