package Model.TextFileManipulation;

import Model.Exceptions.MethodException;
import Model.Exceptions.NoSuchTickerException;
import Model.Exceptions.WebsiteDataException;
import Model.QuoteServer.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Darren on 21/11/2016.
 */
public class HeldStocks {


    public ArrayList<ArrayList> getHeldStocks() throws WebsiteDataException, NoSuchTickerException, MethodException {

        ArrayList<ArrayList> folios = new ArrayList();
        ArrayList<ArrayList> folio = new ArrayList();

        // Go to the file and get the held stocks

        int tempNum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("Folios.txt"))){

            for (String line; (line = br.readLine()) != null;){

                ArrayList newLine = new ArrayList();

                String[] lineSplit = line.split("/");

                IQuote quote = new Quote(false);

                quote.setValues(lineSplit[0].trim());

                double currentPrice = quote.getLatest();

                newLine.add(lineSplit[0].trim());
                newLine.add(lineSplit[1].trim());
                newLine.add(lineSplit[2].trim());
                newLine.add(lineSplit[3].trim());
                newLine.add(lineSplit[4].trim());
                newLine.add(currentPrice);

                tempNum = Integer.parseInt(lineSplit[4].trim());

                //This takes the format - Symbol / Name / Amount / TotalPrice / FolioNum / CurrentPrice


                while (folios.size() <= tempNum){
                    folios.add(new ArrayList<ArrayList>());
                }

                folios.get(tempNum).add(newLine);


            }

             }

             catch (IOException e) {
            e.printStackTrace();
        }

        folios.add(folio);

        // This will contain the Stock object and the amount + totalPrice
        return folios;
    }






}
