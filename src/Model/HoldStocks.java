package Model;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Darren on 21/11/2016.
 */
public class HoldStocks {

    public HoldStocks(ArrayList<ArrayList> folios){

        //Save the Stock + the amount in the file

        for (ArrayList array : folios){

            array.get(0);
            array.get(1);
            array.get(2);
            array.get(3);

            try (PrintWriter out = new PrintWriter(("Folios.txt"))){

                out.println(array.get(0) + " / " + array.get(2) + " / " + array.get(3) + " / " + array.get(4));

            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }







    }

}
