package View;

import javax.swing.*;

/**
 * Created by Ryan on 28/11/2016.
 */
public class Menu {

    public JMenuBar init() {

        JMenuBar MenuBar = new JMenuBar();

        JMenu MenuOptions = new JMenu("Options");
        MenuBar.add(MenuOptions);

        JMenuItem NewFolio = new JMenuItem("New Portfolio");
        MenuOptions.add(NewFolio);

        JMenuItem OpenFolio = new JMenuItem("Open Portfolio");
        MenuOptions.add(OpenFolio);

        JMenuItem SaveFolio = new JMenuItem("Save Portfolio");
        MenuOptions.add(SaveFolio);

        JMenuItem DeleteFolio = new JMenuItem("Delete Portfolio");
        MenuOptions.add(DeleteFolio);

        JMenuItem Exit = new JMenuItem("Exit");
        MenuOptions.add(Exit);

        return MenuBar;
    }

}
