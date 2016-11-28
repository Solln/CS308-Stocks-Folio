import Model.*;

import java.util.ArrayList;


public class testClass {

    static HeldStocks stocks = new HeldStocks();

    static ArrayList<ArrayList> testFolios = new ArrayList<>();

    public static void main(String[] args) throws WebsiteDataException, NoSuchTickerException {

        testHeld();

        testHold();

    }


    private static void testHeld(){

        try {

            ArrayList<ArrayList> folios = stocks.getHeldStocks();


            for (ArrayList<ArrayList> x : folios){


                for (ArrayList<ArrayList> stockDetails : x) {


                    System.out.println("Ticker: " + stockDetails.get(0));
                    System.out.println("Name: " + stockDetails.get(1));
                    System.out.println("Amount: " + stockDetails.get(2));
                    System.out.println("Total Spent: " + stockDetails.get(3));
                    System.out.println("Folio Number: " + stockDetails.get(4));

                    String ticker = String.valueOf(stockDetails.get(0));

                    System.out.println("Current Price: " + StrathQuoteServer.getLastValue(ticker));

                }

                testFolios = folios;

            }


            System.out.println("Done");


        } catch (Exception e) {
            System.err.println(e);
        }

    }


    private static void testHold(){

        ArrayList testStock = new ArrayList();

        testStock.add("fb");
        testStock.add("Facebook");
        testStock.add("111");
        testStock.add("999");
        testStock.add("1");

        testFolios.get(1).add(testStock);

        new HoldStocks(testFolios);


    }


}