/**
 *timer
 *

 */
package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.time.*;
import java.time.Instant;
import java.util.Scanner;

public class _02 {
    public static void main(String[] args) {
        TimePrinter timePrinter = new TimePrinter();
        Timer timer = new Timer(1000,timePrinter);
        timer.start();

        JOptionPane.showMessageDialog(null,"quit program?");
        System.exit(0);
    }

}
class TimePrinter implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone ,the time is" + Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
