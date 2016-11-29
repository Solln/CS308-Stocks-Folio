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

    public ArrayList<ArrayList> folios = null;


    @Override
    public ArrayList<ArrayList> getFolios() throws WebsiteDataException, NoSuchTickerException, MethodException {

        HeldStocks stocks = new HeldStocks();

        ArrayList<ArrayList> folios = stocks.getHeldStocks();

        this.folios = folios;

        return folios;

    }


    @Override
    public void setFolios(List folios) {

        new HoldStocks((ArrayList<ArrayList>) folios);

    }


    @Override
    public List addStock(int folioNumber, List stock) throws WebsiteDataException, NoSuchTickerException, MethodException {

        ArrayList<ArrayList> folios = getFolios();

        while (folios.size() <= folioNumber){
            folios.add(new ArrayList<ArrayList>());
        }

        folios.get(folioNumber).add(stock);

        setFolios(folios);

        return getFolios();

    }


    @Override
    public List removeStock(int folioNumber, String ticker) throws WebsiteDataException, NoSuchTickerException, MethodException {

        ArrayList<ArrayList> folios = getFolios();

        ArrayList<ArrayList> folio = folios.get(folioNumber);

        int temp = 0;

        for (ArrayList stock : folio){

            if (stock.get(0).equals(ticker)){
                folios.get(folioNumber).remove(temp);
                break;
            }
            else{
            temp++;
            }

        }


        setFolios(folios);

        return getFolios();

    }
}
