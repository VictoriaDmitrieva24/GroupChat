package org.Group_Chat;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class UserWindow {

    private static final int PORT = 8189;
    private static final int Width = 600;
    private static final int Height = 400;

    public static void main (String[] args){

    }

    private final JTextArea log = new JTextArea();
    private final JTextField fieldNickname = new JTextField("alina");
    private final JTextField fieldInput = new JTextField();


    private UserWindow(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(Width,Height);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        log.setEditable(false);
        log.setLineWrap(true);



    }

    private void setAlwaysOnTop(boolean b) {

    }

    private void setLocationRelativeTo(Object o) {

    }

    private void setSize(int width, int height) {
    }

    private void setDefaultCloseOperation(int exitOnClose) {
    }
}
