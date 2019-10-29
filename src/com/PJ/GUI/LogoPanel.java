package com.PJ.GUI;

import com.PJ.GUI.MainFrameShop;

import javax.swing.*;
import java.awt.*;

public class LogoPanel extends JPanel implements MainFrameShop {

    private ImageIcon shopIcon;

    LogoPanel(){
    }

    public void paint(Graphics g){

        g.setColor(Color.black);
        g.fillRect(20,30 , 630, 100 );

        g.setColor(Color.GRAY);
        g.fillRect(30,40,630,100);

        shopIcon = new ImageIcon("C:\\ProjektJava\\src\\com\\PJ\\icon\\dressingroommakeup.png");
        shopIcon.paintIcon(this, g, 100, 40);

        g.setColor(Color.black);
        g.setFont(new Font(nameFont, style, 75));
        g.drawString("Beauty Shop", 250, 300);

        g.dispose();
    }

}
