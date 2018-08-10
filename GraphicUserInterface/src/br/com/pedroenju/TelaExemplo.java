package br.com.pedroenju;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

public class TelaExemplo extends JFrame {

    public TelaExemplo() throws HeadlessException {

        super("Tela Exemplo");
        init();
        showMe();

    }

    private void init() {

        this.setLayout(new BorderLayout());

        JPanel myP = new JPanel(new FlowLayout());
        myP.setBorder(new TitledBorder("Botões"));
        this.add(myP, BorderLayout.WEST);

        JButton myBtn = new JButton("Botão One");
        myP.add(myBtn);

        ///////////////////////////////////////////////
        JPanel myP2 = new JPanel();
        this.add(myP2, BorderLayout.CENTER);

        SpringLayout spl = new SpringLayout();
        myP2.setLayout(spl);

        JLabel myLb = new JLabel("Eu sou a Label");
        myP2.add(myLb);

        JComboBox myCB = new JComboBox(new Object[]{
            "Selecione",
            "Opção 1",
            "Opção 2",
            "Opção 3"
        });
        myP2.add(myCB);

        spl.putConstraint(SpringLayout.WEST, myCB, 5, SpringLayout.WEST, myLb);
        spl.putConstraint(SpringLayout.NORTH, myCB, 2, SpringLayout.SOUTH, myLb);

        //spl.putConstraint(SpringLayout.EAST, myCB, -100, SpringLayout.EAST, myP2);
        
        spl.putConstraint(SpringLayout.WEST, myLb, 10, SpringLayout.WEST, myP2);
        spl.putConstraint(SpringLayout.NORTH, myLb, 10, SpringLayout.NORTH, myP2);

    }

    private void showMe() {

        this.pack();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);

    }

}
