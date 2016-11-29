package View;

import Controller.BuyShareListener;
import Controller.SellShareListener;

import java.awt.BorderLayout;
import javax.swing.*;

public class FolioGUI extends JPanel {

    private JFrame FolioFrame;
    public JTextField TickerTable = new JTextField(10);
    public JTextField NumTable = new JTextField(10);

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
        FolioFrame.setSize(700, 600);
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

        JPanel Buttons = new JPanel();

        JLabel TickerLabel = new JLabel("Ticker Symbol");
        Buttons.add(TickerLabel);

        Buttons.add(TickerTable);

        JLabel NumLabel = new JLabel("Number of Shares");
        Buttons.add(NumLabel);

        Buttons.add(NumTable);

        JButton BuyShare = new JButton("Buy Shares");
        Buttons.add(BuyShare);
        BuyShare.addActionListener(new BuyShareListener(this));

        JButton SellShare = new JButton("Sell Shares");
        Buttons.add(SellShare);
        SellShare.addActionListener(new SellShareListener());


        FolioFrame.getContentPane().add(Buttons, BorderLayout.NORTH);

        BottomButtons addBottomButtons = new BottomButtons();
        FolioFrame.getContentPane().add(addBottomButtons.init(), BorderLayout.SOUTH);

    }

    public void tabs() {
        Tabs addTabs = new Tabs();
        FolioFrame.getContentPane().add(addTabs.init(), BorderLayout.CENTER);
    }

}
