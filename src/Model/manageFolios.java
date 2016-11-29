package Model;

import Model.Exceptions.MethodException;
import Model.Exceptions.NoSuchTickerException;
import Model.Exceptions.WebsiteDataException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Darren on 29/11/2016.
 */
public interface ManageFolios {

    ArrayList<ArrayList> getFolios() throws NoSuchTickerException, WebsiteDataException, MethodException;

    void setFolios(List folios);

    List addStock(int folioNumber, List stock) throws NoSuchTickerException, WebsiteDataException, MethodException;

    List removeStock(int folioNumber, String ticker) throws NoSuchTickerException, WebsiteDataException, MethodException;

    List addFolio() throws WebsiteDataException, NoSuchTickerException, MethodException;

    List removeFolio(int folioNumber) throws WebsiteDataException, NoSuchTickerException, MethodException;

    double calculateWorth(int folioNumber, String ticker) throws WebsiteDataException, NoSuchTickerException, MethodException;
}
