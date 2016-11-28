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
		FolioFrame.setSize(900, 900);
		FolioFrame.setLocationRelativeTo(null);
		FolioFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void makeFrameVisible() {
		FolioFrame.setVisible(true);
	}

	public void menuBar() {
		Menu addMenuBar = new Menu();
		FolioFrame.setJMenuBar(addMenuBar.init());
	}

	public void buttons() {
		TopButtons addTopButtons = new TopButtons();
		FolioFrame.getContentPane().add(addTopButtons.init(), BorderLayout.NORTH);

		BottomButtons addBottomButtons = new BottomButtons();
		FolioFrame.getContentPane().add(addBottomButtons.init(), BorderLayout.SOUTH);
	}

	public void tabs() {

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
