package Controller;

import Model.Exceptions.MethodException;
import Model.Exceptions.NoSuchTickerException;
import Model.Exceptions.WebsiteDataException;
import Model.FolioWorker;
import Model.ManageFolios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Cairns on 28/11/2016.
 */

public class Controller {

    public ActionListener buyShareListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int amountOfShares = 0;
                String ticker = null;
                int folioNum = 0;
                String name = null;
                int totalSpent = 0;

                ManageFolios worker = new FolioWorker();

                ArrayList newStock = new ArrayList();

                newStock.add(ticker);
                newStock.add(name);
                newStock.add(amountOfShares);
                newStock.add(totalSpent);
                newStock.add(folioNum);

                try {
                    worker.addStock(folioNum, newStock);
                } catch (NoSuchTickerException e1) {
                    e1.printStackTrace();
                } catch (WebsiteDataException e1) {
                    e1.printStackTrace();
                } catch (MethodException e1) {
                    e1.printStackTrace();
                }


            }
        };
    }


    public ActionListener changeTabListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        };
    }


    public ActionListener closeFolioListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        };
    }


    public ActionListener deleteFolioListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        };
    }


    public ActionListener menuBarListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (e.getActionCommand().equals("New Portfolio")) {
                    System.out.println("New Portfolio");

                } else if (e.getActionCommand().equals("Open Portfolio")) {
                    System.out.println("Open Portfolio");

                } else if (e.getActionCommand().equals("Save Portfolio")) {
                    System.out.println("Save Portfolio");

                } else if (e.getActionCommand().equals("Delete Portfolio")) {
                    System.out.println("Delete Portfolio");

                } else if (e.getActionCommand().equals("Refresh Portfolio")) {
                    System.out.println("Refresh Portfolio");

                }



                else if (e.getActionCommand().equals("Exit")) {
                    System.exit(0);
                }


            }
        };
    }


    public ActionListener newFolioListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        };
    }


    public ActionListener refreshFolioListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        };
    }


    public ActionListener sellShareListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        };
    }









}


