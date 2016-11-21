package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

public class FolioGUI extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JFrame FolioFrame;
    private JTabbedPane tabbedPane = new JTabbedPane();

    public static void main(String[] args) {
        new FolioGUI();

    }


    public FolioGUI() {

        FolioFrame = new JFrame();
        FolioFrame.setTitle("Folio Tracker");
        FolioFrame.setSize(800, 800);
        FolioFrame.setLocationRelativeTo(null);
        FolioFrame.add(tabbedPane, BorderLayout.CENTER);

        MenuBar();
        TabPane();
        button();


        FolioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FolioFrame.setVisible(true);

    }

    public void MenuBar() {

        JMenuBar MenuBar = new JMenuBar();
        FolioFrame.setJMenuBar(MenuBar);

        JMenu MenuOptions = new JMenu("Options");
        MenuBar.add(MenuOptions);

        JMenuItem NewFolio = new JMenuItem("New Portfolio");
        MenuOptions.add(NewFolio);

        JMenuItem OpenFolio = new JMenuItem("Open Portfolio");
        MenuOptions.add(OpenFolio);

        JMenuItem SaveFolio = new JMenuItem("Save Portfolio");
        MenuOptions.add(SaveFolio);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setActionCommand("Exit");
        MenuOptions.add(Exit);
    }

    public void TabPane() {

        JTabbedPane TabPane = new JTabbedPane(JTabbedPane.TOP);
        SpringLayout springLayout = new SpringLayout();
        FolioFrame.getContentPane().setLayout(springLayout);
        springLayout.putConstraint(SpringLayout.WEST, TabPane, 10,
                SpringLayout.WEST, FolioFrame.getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, TabPane, -10,
                SpringLayout.EAST, FolioFrame.getContentPane());
        FolioFrame.getContentPane().add(TabPane);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        String[] columnNames = { "Ticker Symbol", "Stock Name", "No. Shares", "Price per Share", "Value", "Gain" };
        Object[][] data1 = {
                { "TST 1", "Test Stock 1", new Integer(100), new Integer(1), new Integer(100), new Integer(10) } };

        Object[][] data2 = {
                { "TST 2", "Test Stock 2", new Integer(150), new Integer(2), new Integer(300), new Integer(125) } };

        Object[][] data3 = {
                { "TST 1", "Test Stock 3", new Integer(100), new Integer(3), new Integer(300), new Integer(100) } };

        final JTable FolioTable1 = new JTable(data1, columnNames);
        FolioTable1.setPreferredScrollableViewportSize(new Dimension(300, 70));
        FolioTable1.setFillsViewportHeight(true);

        final JTable FolioTable2 = new JTable(data2, columnNames);
        FolioTable2.setPreferredScrollableViewportSize(new Dimension(300, 70));
        FolioTable2.setFillsViewportHeight(true);

        final JTable FolioTable3 = new JTable(data3, columnNames);
        FolioTable3.setPreferredScrollableViewportSize(new Dimension(300, 70));
        FolioTable3.setFillsViewportHeight(true);

        JScrollPane scrollPane1 = new JScrollPane(FolioTable1);
        TabPane.addTab("Folio 1", null, scrollPane1, null);

        JScrollPane scrollPane2 = new JScrollPane(FolioTable2);
        TabPane.addTab("Folio 2", null, scrollPane2, null);

        JScrollPane scrollPane3 = new JScrollPane(FolioTable3);
        TabPane.addTab("Folio 3", null, scrollPane3, null);

    }

    public void button(){
        JButton btnAddStock = new JButton("Add Stock");
        FolioFrame.getContentPane().add(btnAddStock);
    }


}