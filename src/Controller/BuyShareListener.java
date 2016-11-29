package Controller;

import Model.Exceptions.MethodException;
import Model.Exceptions.NoSuchTickerException;
import Model.Exceptions.WebsiteDataException;
import Model.FolioWorker;
import Model.ManageFolios;
import Model.QuoteServer.Quote;
import View.FolioGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Ryan on 29/11/2016.
 */
public class BuyShareListener implements ActionListener {

    FolioGUI copy;

    public BuyShareListener(FolioGUI folioGUI) {

        copy = folioGUI;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int amountOfShares = 0;
        String ticker = null;
        int folioNum = 0;
        String name = null;
        int totalSpent = 0;

        ManageFolios worker = new FolioWorker();

        ArrayList newStock = new ArrayList();

        Quote quote = new Quote(false);

        newStock.add(copy.TickerTable.getText());
        newStock.add("Placeholder");
        newStock.add(copy.NumTable.getText());
        newStock.add(totalSpent);
        newStock.add(folioNum);

        try {
            worker.addStock(folioNum, newStock);
        } catch (NoSuchTickerException e1) {
            e1.printStackTrace();
        } catch (WebsiteDataException e1) {
            e1.printStackTrace();
        } catch (MethodException e1) {
            e1.printStackTrace();
        }

    }
}
