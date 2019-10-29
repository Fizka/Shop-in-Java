package com.PJ.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniLogoListener implements ActionListener {

    private final JFrame frame;

    public MiniLogoListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent event) {


        Thread t = Thread.currentThread();
        t.setName("Admin Thread");

        // set thread priority to 1
        t.setPriority(1);

        // prints the current thread
        System.out.println("Thread = " + t);

        int count = Thread.activeCount();
        System.out.println("currently active threads = " + count);

        Thread th[] = new Thread[count];
        // returns the number of threads put into the array
        Thread.enumerate(th);

        // prints active threads
        for (int i = 0; i < count; i++) {
            System.out.println(i + ": " + th[i]);
        }


        //zmiany wyglądu wywołujemy w wątku dystrybucji zdarzeń
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                StartListener listener = new StartListener(frame);
                JPanel inventoryPanel = new InventoryPanel(listener, frame);

                frame.getContentPane().removeAll();
                frame.add(inventoryPanel);
                frame.validate();
            }
        });
    }




}
