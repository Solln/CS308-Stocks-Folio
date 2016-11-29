import Model.*;
import Model.Exceptions.MethodException;
import Model.Exceptions.NoSuchTickerException;
import Model.Exceptions.WebsiteDataException;
import Model.TextFileManipulation.HeldStocks;

import java.util.ArrayList;


public class TestClass {

    static HeldStocks stocks = new HeldStocks();

    static ArrayList<ArrayList> testFolios = new ArrayList<>();

    static ManageFolios newFolios = new FolioWorker();;

    public static void main(String[] args) throws WebsiteDataException, NoSuchTickerException, MethodException {

        testHeld();

        testHold();

    }


    private static void testHeld(){

        System.out.println("Starting");

        try {

            ArrayList<ArrayList> folios = newFolios.getFolios();


            for (ArrayList<ArrayList> folio : folios){


                for (ArrayList<ArrayList> stockDetails : folio) {


                    System.out.println("Ticker: " + stockDetails.get(0));
                    System.out.println("Name: " + stockDetails.get(1));
                    System.out.println("Amount: " + stockDetails.get(2));
                    System.out.println("Total Spent: " + stockDetails.get(3));
                    System.out.println("Folio Number: " + stockDetails.get(4));

                    System.out.println("Current Price: " + stockDetails.get(5));

                }

                testFolios = folios;

            }


            System.out.println("Done");


        } catch (Exception e) {
            System.err.println(e);
        }

    }


    private static void testHold() throws WebsiteDataException, NoSuchTickerException, MethodException {

        ArrayList testStock = new ArrayList();

        testStock.add("fb");
        testStock.add("Facebook");
        testStock.add("111");
        testStock.add("999");
        testStock.add("1");

        newFolios.addStock(1, testStock);

        System.out.println("Added");

    }


}