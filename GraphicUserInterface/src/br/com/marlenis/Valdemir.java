/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marlenis;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;
import org.omg.CORBA.ORB;

/**
 *
 * @author Marlon
 */
public class Valdemir extends JFrame {

    public Valdemir() throws HeadlessException {
        super("La tela");
        init();
        showme();
    }

    private void init() {
      
        this.setLayout(new BorderLayout());
      JPanel meuPainel = new JPanel(new FlowLayout());
      
      meuPainel.setBorder(new TitledBorder("Botões"));
      this.add(meuPainel,BorderLayout.NORTH);
        
      JButton meuBotao = new JButton("Meu botãozinho");
        meuPainel.add(meuBotao); 
      
        JPanel meuoutropainel = new JPanel();
        this.add(meuoutropainel,BorderLayout.CENTER);
        
        SpringLayout spl = new SpringLayout();
        meuoutropainel.setLayout(spl);
        
        JLabel labelzinha = new JLabel("eu sou a label");
        meuoutropainel.add(labelzinha);
        
        JComboBox jcb = new JComboBox(new Object[]{"Selecione","Opção 1","Opção 2"});
    
        meuoutropainel.add(jcb);
        spl.putConstraint(SpringLayout.WEST, jcb, 5, SpringLayout.WEST, labelzinha);
        spl.putConstraint(SpringLayout.NORTH, jcb, 2, SpringLayout.SOUTH, labelzinha);
    }

    private void showme() {
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    
    
}
