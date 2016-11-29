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
import java.io.IOException;
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

        int amountOfShares = Integer.parseInt(copy.NumTable.getText());
        String ticker = copy.TickerTable.getText();
        int folioNum = 0;
        String name = null;
        double totalSpent = 0;

        ManageFolios worker = new FolioWorker();

        ArrayList newStock = new ArrayList();

        Quote quote = new Quote(false);

        try {
            quote.setValues(ticker);
            totalSpent = amountOfShares * quote.getLatest();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (WebsiteDataException e1) {
            e1.printStackTrace();
        } catch (NoSuchTickerException e1) {
            e1.printStackTrace();
        } catch (MethodException e1) {
            e1.printStackTrace();
        }


        newStock.add(ticker);
        newStock.add("Placeholder");
        newStock.add(amountOfShares);
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
