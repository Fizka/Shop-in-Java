package com.PJ;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartListener implements ActionListener {

    private final JFrame frame;
    private StartPanel startPanel;

    public StartListener(JFrame frame) {
        this.frame = frame;
    }

    public void setPanel(StartPanel startPanel)
    {
        this.startPanel = startPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

            Object source = e.getSource();

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {

                    JPanel signInPanel = new SignInUpPanel(frame);
                    frame.getContentPane().removeAll();
                    frame.add(signInPanel);
                    frame.validate();
               }
           });

    }


}
