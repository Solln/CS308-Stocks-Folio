package Tests;

import Model.FolioWorker;
import Model.ManageFolios;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Darren on 29/11/2016.
 */
public class FolioWorkerTest {

    ArrayList<ArrayList> testFolios = new ArrayList<>();
    ManageFolios newFolios = new FolioWorker();


    @org.junit.Test
    public void getFolios() throws Exception {

            testFolios = newFolios.getFolios();

            ArrayList stock = (ArrayList) testFolios.get(0).get(0);

            assertTrue(stock.get(0).equals("goog"));

    }

    @org.junit.Test
    public void addStockAndSetFolios() throws Exception {

        ArrayList newStock = new ArrayList();

        newStock.add("fb");newStock.add("Facebook");newStock.add("111");
        newStock.add("999");newStock.add("1");

        newFolios.addStock(1, newStock);

        testFolios = newFolios.getFolios();

        ArrayList stock = (ArrayList) testFolios.get(1).get(0);

        assertTrue(stock.get(0).equals("fb"));



    }


    @org.junit.Test
    public void removeStock() throws Exception {

        newFolios.removeStock(1, "fb");

        testFolios = newFolios.getFolios();

        assertFalse(testFolios.get(1).contains("fb"));

    }



    @org.junit.Test
    public void calculateWorth() throws Exception{

        double worth = newFolios.calculateWorth(0, "goog");

       assertTrue(worth > 1200);


    }




}