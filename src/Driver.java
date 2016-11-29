import Model.Exceptions.MethodException;
import Model.Exceptions.NoSuchTickerException;
import Model.Exceptions.WebsiteDataException;
import Model.FolioWorker;
import View.FolioGUI;

/**
 * Created by Ryan on 29/11/2016.
 */
public class Driver {

    public static void main(String[] args) throws WebsiteDataException, NoSuchTickerException, MethodException {

        FolioWorker m = new FolioWorker();
        FolioGUI gui = new FolioGUI();


        gui.TickerTable.getText();

    }
}
