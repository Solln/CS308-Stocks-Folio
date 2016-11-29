package View;

import Controller.*;
import Model.Exceptions.MethodException;
import Model.Exceptions.NoSuchTickerException;
import Model.Exceptions.WebsiteDataException;
import Model.FolioWorker;

import java.awt.BorderLayout;
import javax.swing.*;

public class FolioGUI extends JPanel {

    private JFrame FolioFrame;
    public JTextField TickerTable = new JTextField(10);
    public JTextField NumTable = new JTextField(10);
    public JPanel tabsPanel = new JPanel();
    public JTabbedPane tabs = new JTabbedPane();


    public FolioGUI() throws WebsiteDataException, NoSuchTickerException, MethodException {
        frame();
        menuBar();
        topButtons();
        tabs();
        bottomButtons();
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

        JMenuBar MenuBar = new JMenuBar();

        JMenu MenuOptions = new JMenu("Options");
        MenuBar.add(MenuOptions);

        JMenuItem NewFolio = new JMenuItem("New Portfolio");
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

        JMenuItem Refresh = new JMenuItem("Refresh Portfolio");
        MenuOptions.add(Refresh);
        Refresh.addActionListener(new MenuBarListener());


        JMenuItem Exit = new JMenuItem("Exit");
        MenuOptions.add(Exit);
        Exit.addActionListener(new MenuBarListener());

        FolioFrame.setJMenuBar(MenuBar);
    }

    public void topButtons() {

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
        SellShare.addActionListener(new SellShareListener(this));


        FolioFrame.getContentPane().add(Buttons, BorderLayout.NORTH);
    }

    public void tabs() throws WebsiteDataException, NoSuchTickerException, MethodException {

        FolioWorker folio = new FolioWorker();

        int count = folio.getFolios().size();

        for (int i = 0; i < count; i++) {
            tabs.add(addTable(), "Folio " + i);
        }

        tabsPanel.add(tabs);

        FolioFrame.getContentPane().add(tabsPanel, BorderLayout.CENTER);
    }

    public JScrollPane addTable() {

        String[] columnNames = {"Ticker Symbol", "Name of Stock", " Number of Shares", "Price Per Share",
                "Total Value", "Gain"};

        Object[][] data = {
                {"TST 1", "Tester 1", new Double(100), new Double(5), new Double(500), new Double(-500.00)},
                {"TST 2", "Tester 2", new Double(200), new Double(1), new Double(200), new Double(-200)},
                {"TST 3", "Tester 3", new Double(100), new Double(3), new Double(300), new Double(300.00)},};

        JTable stock = new JTable(data, columnNames);
        JScrollPane scrollStock = new JScrollPane(stock);
        return scrollStock;
    }

    public void bottomButtons() {
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

        FolioFrame.getContentPane().add(Buttons, BorderLayout.SOUTH);
    }

}
