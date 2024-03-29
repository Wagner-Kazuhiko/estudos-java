package com.swing.teste.gui;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {

    private final JLabel label1; //JLabel apenas com texto
    private final JLabel label2; // JLabel construído com texto e ícone
    private final JLabel label3; // JLabel com texto e ícone adicionados

    // construtor LabelFrame adiciona JLabels a JFrame
    public LabelFrame() {
        super("Testing JLabel");
        setLayout(new FlowLayout()); // configura o layout de frame


        // Construtor JLabel com um argumento de string
        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1); //adiciona o label1 ao JFrame

        // construtor JLabel com string, Icon e argumentos de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2); // adiciona label2 ao JFrame

        label3 = new JLabel(); // Construtor JLabel sem argumentos
        label3.setText("Label1 with icon and text at bottom");
        label3.setIcon(bug); // adiciona o ícone ao JLabel
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);  // adiciona label3 ao JFrame
    }
}
