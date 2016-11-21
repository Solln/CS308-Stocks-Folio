package View;
import javax.swing.*;
import java.awt.*;

public class FolioGUI extends JPanel {

    private JFrame FolioFrame;

    public static void main(String[] args) {
        new FolioGUI();
    }

    public FolioGUI() {
        createFrame();
        addMenuBar();
        addButtons();
        addTabs();
        makeFrameVisible();
    }

    public void createFrame(){
        FolioFrame = new JFrame();
        FolioFrame.setTitle("Folio Tracker");
        FolioFrame.setSize(600, 600);
        FolioFrame.setLocationRelativeTo(null);
        FolioFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void makeFrameVisible(){
        FolioFrame.setVisible(true);
    }

    public void addMenuBar() {
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
        MenuOptions.add(Exit);

        MenuOptions.add(Exit);
    }

    public void addButtons() {
        JPanel buttons = new JPanel();
        JButton addStock = new JButton("Add Stock");
        buttons.add(addStock);
        JButton buyStock = new JButton("Buy Stock");
        buttons.add(buyStock);

        FolioFrame.getContentPane().add(buttons, BorderLayout.NORTH);
    }

    public void addTabs(){
        JPanel tabsPanel = new JPanel();
        JTabbedPane tabs = new JTabbedPane();

        tabs.add(addTable(), "NAME");
        tabs.add(addTable(), "TEST");

        tabsPanel.add(tabs);

        FolioFrame.getContentPane().add(tabsPanel, BorderLayout.CENTER);
    }

    public JScrollPane addTable(){
        String[] columnNames = {"One", "Two"};
        Object[][] data = {{"One one", "One two"}, {"Two one","Two two"}};

        JTable stock = new JTable(data, columnNames);

        JScrollPane scrollStock = new JScrollPane(stock);

        return scrollStock;
    }

}