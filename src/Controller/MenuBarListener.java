package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBarListener implements ActionListener {

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

        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }

    }
}
