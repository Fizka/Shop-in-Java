package com.PJ.GUI;

import javax.swing.*;
import java.awt.*;

public interface MainFrameShop {

    int style = Font.BOLD | Font.ITALIC;

    String nameFont = "Garamond";
    String nameFont2 = "Jokerman";

    Font myFont = new Font ("Garamond", style , 25);
    Font myFonttwo = new Font ("Garamond", style , 16);

    Dimension frameSize = new Dimension(700, 700);
    Dimension logoSize = new Dimension(700, 350);


}
