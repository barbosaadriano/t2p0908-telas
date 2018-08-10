/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Usuario
 */
public class TelaTeste extends JFrame{

    public TelaTeste() throws HeadlessException {
        super("Tela Teste");
        init();
        showMe();
    }

    private void init() {
        this.setLayout(new BorderLayout());
        
        JPanel painel1 = new JPanel(new FlowLayout());
        painel1.setBorder(new TitledBorder("Botoes"));
        this.add(painel1, BorderLayout.SOUTH);
        
        JButton botao1 = new JButton("clicar");
        painel1.add(botao1);
        
        JPanel painel2 = new JPanel();
        this.add(painel2, BorderLayout.CENTER);
        
        SpringLayout spl = new SpringLayout();
        painel2.setLayout(spl);
        
        JLabel Lbl1 = new JLabel("CIDADE!!!!!!!!!!");
        painel2.add(Lbl1);
        
        JComboBox combobox1 = new JComboBox(new Object[]{
            "selecione",
            "palotina",
            "toledo",
            "maripa"});
        painel2.add(combobox1);
        
        spl.putConstraint(SpringLayout.WEST, combobox1, 5, SpringLayout.WEST, Lbl1);
        spl.putConstraint(SpringLayout.NORTH, combobox1, 2, SpringLayout.SOUTH, Lbl1);
                
    }

    private void showMe() {
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    
    
}
