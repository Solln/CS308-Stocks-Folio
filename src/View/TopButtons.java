package View;

import javax.swing.*;

/**
 * Created by Ryan on 28/11/2016.
 */
public class TopButtons {

    public JPanel init() {

        JPanel Buttons = new JPanel();

        JLabel TickerL1 = new JLabel("Ticker Symbol");
        Buttons.add(TickerL1);
        JTextField TickerT1 = new JTextField(10);
        Buttons.add(TickerT1);

        JLabel NumL1 = new JLabel("Number of Shares");
        Buttons.add(NumL1);
        JTextField NumT1 = new JTextField(10);
        Buttons.add(NumT1);

        JButton BuyShareB = new JButton("Buy Shares");
        Buttons.add(BuyShareB);

        JButton SellShareB = new JButton("Sell Shares");
        Buttons.add(SellShareB);

        return Buttons;
    }


}
