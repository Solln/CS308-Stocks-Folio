package Model;

import Model.Exceptions.MethodException;
import Model.Exceptions.NoSuchTickerException;
import Model.Exceptions.WebsiteDataException;
import Model.TextFileManipulation.HeldStocks;
import Model.TextFileManipulation.HoldStocks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darren on 29/11/2016.
 */
public class FolioWorker implements ManageFolios {

    @Override
    public ArrayList<ArrayList> getFolios() throws WebsiteDataException, NoSuchTickerException, MethodException {

        HeldStocks stocks = new HeldStocks();

        ArrayList<ArrayList> folios = stocks.getHeldStocks();

        return folios;

    }


    @Override
    public void setFolios(List folios) {

        new HoldStocks((ArrayList<ArrayList>) folios);

    }


    @Override
    public void addStock(int folioNumber, List stock) throws WebsiteDataException, NoSuchTickerException, MethodException {

        ArrayList<ArrayList> folios = getFolios();

        while (folios.size() <= folioNumber){
            folios.add(new ArrayList<ArrayList>());
        }

        folios.get(folioNumber).add(stock);

        setFolios(folios);

    }


    @Override
    public void removeStock(int folioNumber, String ticker) throws WebsiteDataException, NoSuchTickerException, MethodException {

        ArrayList<ArrayList> folios;

        folios = new HeldStocks().getHeldStocks().get(folioNumber);

            for (ArrayList stock : folios){
                if (stock.contains("ticker")){
                    folios.remove(stock);
                }
            }




    }
}
