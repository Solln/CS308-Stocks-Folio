package View;

import java.awt.BorderLayout;
import javax.swing.*;

public class FolioGUI extends JPanel {

    private JFrame FolioFrame;

    public static void main(String[] args) {
        new FolioGUI();
    }

    public FolioGUI() {
        frame();
        menuBar();
        buttons();
        tabs();
        makeFrameVisible();
    }

    public void frame() {
        FolioFrame = new JFrame();
        FolioFrame.setTitle("Folio Tracker");
        FolioFrame.setSize(700, 700);
        FolioFrame.setLocationRelativeTo(null);
        FolioFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void makeFrameVisible() {
        FolioFrame.setVisible(true);
    }

    public void menuBar() {

        MenuBar addMenuBar = new MenuBar();
        FolioFrame.setJMenuBar(addMenuBar.init());
    }

    public void buttons() {
        TopButtons addTopButtons = new TopButtons();
        FolioFrame.getContentPane().add(addTopButtons.init(), BorderLayout.NORTH);

        BottomButtons addBottomButtons = new BottomButtons();
        FolioFrame.getContentPane().add(addBottomButtons.init(), BorderLayout.SOUTH);
    }

    public void tabs() {
        Tabs addTabs = new Tabs();
        FolioFrame.getContentPane().add(addTabs.init(), BorderLayout.CENTER);
    }

}
