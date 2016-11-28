package View;

import Controller.BuyShareListener;
import Controller.MenuBarListener;
import Controller.SellShareListener;

import javax.swing.*;

/**
 * Created by Ryan on 28/11/2016.
 */
public class Buttons {

    public JPanel init() {

        JPanel Buttons = new JPanel();

        JLabel TickerLabel = new JLabel("Ticker Symbol");
        Buttons.add(TickerLabel);

        JTextField TickerTable = new JTextField(10);
        Buttons.add(TickerTable);

        JLabel NumLabel = new JLabel("Number of Shares");
        Buttons.add(NumLabel);

        JTextField NumTable = new JTextField(10);
        Buttons.add(NumTable);

        JButton BuyShare = new JButton("Buy Shares");
        Buttons.add(BuyShare);
        BuyShare.addActionListener(new BuyShareListener());

        JButton SellShare = new JButton("Sell Shares");
        Buttons.add(SellShare);
        SellShare.addActionListener(new SellShareListener());

        return Buttons;
    }


}
