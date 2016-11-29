package View;

import Controller.BuyShareListener;
import Controller.SellShareListener;

import javax.swing.*;

/**
 * Created by Ryan on 29/11/2016.
 */
public class BottomButtons {

    public JPanel init() {

        JPanel Buttons = new JPanel();

        JButton BuyShare = new JButton("Close Folio");
        Buttons.add(BuyShare);
        BuyShare.addActionListener(new BuyShareListener());

        JButton SellShare = new JButton("Delete Folio");
        Buttons.add(SellShare);
        SellShare.addActionListener(new SellShareListener());

        return Buttons;
    }


}
