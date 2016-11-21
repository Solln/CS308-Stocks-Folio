package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Darren on 21/11/2016.
 */
public class HeldStocks {


    public ArrayList<ArrayList> getHeldStocks() {

        ArrayList<ArrayList> folios = new ArrayList();

        // Go to the file and get the held stocks

        try (BufferedReader br = new BufferedReader(new FileReader("Folios.txt"))){

            for (String line; (line = br.readLine()) != null;){

                ArrayList newLine = new ArrayList();

                String[] lineSplit = line.split("/");

                newLine.add(lineSplit[0]);
                newLine.add(lineSplit[1]);
                newLine.add(lineSplit[2]);
                newLine.add(lineSplit[3]);
                newLine.add(lineSplit[4]);

                folios.add(newLine);

            }

             }

             catch (IOException e) {
            e.printStackTrace();
        }



        // This will contain the Stock object and the amount + totalPrice
        return folios;
    }




}
