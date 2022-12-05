package com.projeto.calculadora.visao;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

    public Calculadora(){

        organizarLayaout();

        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayaout() {
        setLayout(new BorderLayout());

        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 60));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }


    public static void main(String[] args) {
        new Calculadora();
    }
}
