package myspring;

import javax.swing.*;

/**
 * Created by Evegeny on 06/11/2016.
 */
public class PopupSpeaker implements Speaker {
    public void speak(String message) {
        JOptionPane.showMessageDialog(null,message);
    }
}
