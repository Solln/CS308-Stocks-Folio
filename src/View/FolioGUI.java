package View;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import java.awt.*;

public class FolioGUI extends JPanel {

	private JFrame FolioFrame;

	public static void main(String[] args) {
		new FolioGUI();
	}

	public FolioGUI() {

		Frame();
		MenuBar();
		Buttons();
		Tabs();
		makeFrameVisible();
	}

	public void Frame() {

		FolioFrame = new JFrame();
		FolioFrame.setTitle("Folio Tracker");
		FolioFrame.setSize(900, 900);
		FolioFrame.setLocationRelativeTo(null);
		FolioFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void makeFrameVisible() {

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

		JMenuItem DeleteFolio = new JMenuItem("Delete Portfolio");
		MenuOptions.add(DeleteFolio);

		JMenuItem Exit = new JMenuItem("Exit");
		MenuOptions.add(Exit);

	}

	public void Buttons() {

		JPanel Buttons = new JPanel();

		JLabel TickerL1 = new JLabel("Ticker Symbol");
		Buttons.add(TickerL1);
		JTextField TickerT1 = new JTextField(10);
		Buttons.add(TickerT1);

		JLabel NumL1 = new JLabel("Number of Shares");
		Buttons.add(NumL1);
		JTextField NumT1 = new JTextField(10);
		Buttons.add(NumT1);

		JButton BuyShareB = new JButton("Buy Shares");
		Buttons.add(BuyShareB);

		JButton SellShareB = new JButton("Sell Shares");
		Buttons.add(SellShareB);

		FolioFrame.getContentPane().add(Buttons, BorderLayout.NORTH);

	}

	public void Tabs() {

		JPanel tabsPanel = new JPanel();
		JTabbedPane tabs = new JTabbedPane();

		tabs.add(addTable(), "Folio 1");
		tabs.add(addTable(), "Folio 2");
		tabs.add(addTable(), "Folio 3");
		tabsPanel.add(tabs);
		FolioFrame.getContentPane().add(tabsPanel, BorderLayout.CENTER);
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
