package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ryan on 28/11/2016.
 */
public class Tabs {

    public JPanel init() {
        JPanel tabsPanel = new JPanel();
        JTabbedPane tabs = new JTabbedPane();

        tabs.add(addTable(), "Folio 1");
        tabs.add(addTable(), "Folio 2");
        tabs.add(addTable(), "Folio 3");
        tabsPanel.add(tabs);

        return tabsPanel;
    }

    public JScrollPane addTable() {

        String[] columnNames = { "Ticker Symbol", "Name of Stock", " Number of Shares", "Price Per Share",
                "Total Value", "Gain" };

        Object[][] data = {
                { "TST 1", "Tester 1", new Double(100), new Double(5), new Double(500), new Double(-500.00) },
                { "TST 2", "Tester 2", new Double(200), new Double(1), new Double(200), new Double(-200) },
                { "TST 3", "Tester 3", new Double(100), new Double(3), new Double(300), new Double(300.00) }, };

        JTable stock = new JTable(data, columnNames);
        JScrollPane scrollStock = new JScrollPane(stock);
        return scrollStock;
    }

}
