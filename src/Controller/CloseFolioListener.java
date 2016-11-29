package Controller;

import View.FolioGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ryan on 29/11/2016.
 */
public class CloseFolioListener implements ActionListener{

    FolioGUI copy;

    public CloseFolioListener(FolioGUI folioGUI) {

        copy = folioGUI;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        copy.tabs.remove(copy.tabs.getSelectedIndex());
        copy.remove(copy.tabsPanel);

    }
}
