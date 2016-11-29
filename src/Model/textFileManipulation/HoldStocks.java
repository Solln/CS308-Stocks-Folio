package Model.TextFileManipulation;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Darren on 21/11/2016.
 */
public class HoldStocks {

    public HoldStocks(ArrayList<ArrayList> folios){

        //Save the Stock + the amount in the file

        try (PrintWriter out = new PrintWriter(("Folios.txt"))) {

        for (ArrayList<ArrayList> array : folios){

            for (ArrayList stock : array) {

                    // The arraylist must contain the format Symbol / Name / Amount / TotalPrice / FolioNum
                    out.println(stock.get(0) + " / " + stock.get(1) + " / " + stock.get(2) + " / " + stock.get(3) + " / " + stock.get(4));

            }

        }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }

}
