package View;

import Controller.*;

import javax.swing.*;

/**
 * Created by Ryan on 29/11/2016.
 */
public class BottomButtons {

    public JPanel init() {

        JPanel Buttons = new JPanel();

        JButton NewFolio = new JButton("New Folio");
        Buttons.add(NewFolio);
        NewFolio.addActionListener(new NewFolioListener());

        JButton CloseFolio = new JButton("Close Folio");
        Buttons.add(CloseFolio);
        CloseFolio.addActionListener(new CloseFolioListener());

        JButton DeleteFolio = new JButton("Delete Folio");
        Buttons.add(DeleteFolio);
        DeleteFolio.addActionListener(new DeleteFolioListener());

        return Buttons;
    }


}
