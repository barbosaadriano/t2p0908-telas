/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

/**
 *
 * @author thiag
 */
public class TelaServicos extends JFrame {

    public TelaServicos() throws HeadlessException {
        super("Tela Serviços");
        init();
        showMe();
    }

    private void init() {
        this.setLayout(new BorderLayout());
        JPanel meuPainel = new JPanel(new FlowLayout());
        meuPainel.setBorder(new TitledBorder(""));
        this.add(meuPainel, BorderLayout.NORTH);

        JLabel label1 = new JLabel("Procedimento:");
        meuPainel.add(label1);

        JComboBox jcb = new JComboBox(new Object[]{
            "Mecânica",
            "Elétrica"
        });
        meuPainel.add(jcb);
        jcb.setPreferredSize(new Dimension(500, 20));

        JButton meuBotao = new JButton("...");
        meuPainel.add(meuBotao);

        JLabel label2 = new JLabel("Custo Hora:");
        meuPainel.add(label2);
        
        JTextField texto1 = new JTextField();
        meuPainel.add(texto1);
        texto1.setPreferredSize(new Dimension(100, 20));
        
        JPanel meuPainel2 = new JPanel();
      
        this.add(meuPainel2, BorderLayout.CENTER);
        meuPainel2.setBorder(new TitledBorder("Descrição Dos Serviços"));
        
        JTable Tabela = new JTable();
        Tabela.setPreferredSize(new Dimension(1500, 500));
        meuPainel2.add(Tabela);
        
        JLabel label3 = new JLabel("Status do cadastro: VIZUALIZANDO");
        label3.setBackground(Color.green);
        meuPainel2.add(label3);

    }

    private void showMe() {
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

}
