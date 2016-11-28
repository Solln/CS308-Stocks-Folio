package View;

import Controller.MenuBarListener;

import javax.swing.*;

/**
 * Created by Ryan on 28/11/2016.
 */
public class MenuBar {

    public JMenuBar init() {

        JMenuBar MenuBar = new JMenuBar();

        JMenu MenuOptions = new JMenu("Options");
        MenuBar.add(MenuOptions);

        JMenuItem NewFolio = new JMenuItem("New Port");
        MenuOptions.add(NewFolio);
        NewFolio.addActionListener(new MenuBarListener());

        JMenuItem OpenFolio = new JMenuItem("Open Portfolio");
        MenuOptions.add(OpenFolio);
        OpenFolio.addActionListener(new MenuBarListener());

        JMenuItem SaveFolio = new JMenuItem("Save Portfolio");
        MenuOptions.add(SaveFolio);
        SaveFolio.addActionListener(new MenuBarListener());

        JMenuItem DeleteFolio = new JMenuItem("Delete Portfolio");
        MenuOptions.add(DeleteFolio);
        DeleteFolio.addActionListener(new MenuBarListener());

        JMenuItem Exit = new JMenuItem("Exit");
        MenuOptions.add(Exit);
        Exit.addActionListener(new MenuBarListener());

        return MenuBar;
    }

}
