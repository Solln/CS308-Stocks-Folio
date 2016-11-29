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

    void addStock(int folioNumber, List stock) throws NoSuchTickerException, WebsiteDataException, MethodException;

    void removeStock(int folioNumber, String ticker) throws NoSuchTickerException, WebsiteDataException, MethodException;

}
