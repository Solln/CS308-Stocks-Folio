package Controller;

import Model.Exceptions.MethodException;
import Model.Exceptions.NoSuchTickerException;
import Model.Exceptions.WebsiteDataException;
import Model.FolioWorker;
import Model.ManageFolios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Cairns on 28/11/2016.
 */
public class BuyShareListener implements ActionListener {


    public void actionPerformed(ActionEvent e) {

        int amountOfShares = 0;
        String ticker = null;
        int folioNum = 0;

        ManageFolios worker = new FolioWorker();

        ArrayList newStock = new ArrayList();

        newStock.add(ticker);newStock.add("Douno");newStock.add(amountOfShares);
        newStock.add("100");newStock.add(folioNum);

        try {
            worker.addStock(folioNum, newStock);
        }

        catch (NoSuchTickerException e1) {
            e1.printStackTrace();
        } catch (WebsiteDataException e1) {
            e1.printStackTrace();
        } catch (MethodException e1) {
            e1.printStackTrace();
        }

    }
}
