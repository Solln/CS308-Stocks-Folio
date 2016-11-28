package View;

import javax.swing.*;

/**
 * Created by Ryan on 28/11/2016.
 */
public class BottomButtons {

    public JPanel init() {

        JPanel Buttons2 = new JPanel();

        JButton NewStock = new JButton("New Stock");
        Buttons2.add(NewStock);

        JButton Refresh = new JButton("Refresh");
        Buttons2.add(Refresh);

        return Buttons2;

    }

}
