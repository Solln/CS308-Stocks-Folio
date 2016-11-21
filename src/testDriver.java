import Model.HeldStocks;

import java.util.ArrayList;

/**
 * Created by Darren on 21/11/2016.
 */
public class testDriver {

    public static void main(String[] args){

        HeldStocks j = new HeldStocks();

        for (ArrayList<ArrayList> list : j.getHeldStocks()){

            System.out.println(list.get(0));
            System.out.println(list.get(1));
            System.out.println(list.get(2));
            System.out.println(list.get(3));
            System.out.println(list.get(4));

        }

    }

}
