/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thallyscalory;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author Usuario
 */
public class Produto extends JFrame{

    public Produto() throws HeadlessException {
        super("PROUTOS");
        init();
        showMe();
    }

    private void init() {
        //this.setLayout(new FlowLayout());
        SpringLayout spl = new SpringLayout();
        this.setLayout(spl);
        
        JLabel LblCod = new JLabel("CODIGO");
        LblCod.setForeground(Color.blue);
        this.add(LblCod);
        
        JLabel lblNome = new JLabel("DESCRICAO PRODUTO");
        lblNome.setForeground(Color.blue);
        this.add(lblNome);
        
        JLabel lblGrupo = new JLabel("GRUPOS");
        lblGrupo.setForeground(Color.blue);
        this.add(lblGrupo);
        
        JLabel lblVlCusto= new JLabel("VALOR DE CUSTO");
        lblVlCusto.setForeground(Color.blue);
        this.add(lblVlCusto);
        
        JLabel lblVlVenda = new JLabel("VALOR DE VENDA");
        lblVlVenda.setForeground(Color.blue);
        this.add(lblVlVenda);
        
        spl.putConstraint(SpringLayout.NORTH, LblCod, 10, SpringLayout.NORTH, this);
        spl.putConstraint(SpringLayout.WEST, LblCod, 8, SpringLayout.WEST, this);
        spl.putConstraint(SpringLayout.NORTH, lblNome, 10, SpringLayout.NORTH, this);
        spl.putConstraint(SpringLayout.WEST, lblNome, 50, SpringLayout.EAST, LblCod);
        spl.putConstraint(SpringLayout.NORTH, lblGrupo, 10, SpringLayout.NORTH, this);
        spl.putConstraint(SpringLayout.WEST, lblGrupo, 200, SpringLayout.EAST, lblNome);
        spl.putConstraint(SpringLayout.NORTH, lblVlCusto, 10, SpringLayout.NORTH, this);
        spl.putConstraint(SpringLayout.WEST, lblVlCusto, 50, SpringLayout.EAST, lblGrupo);
        spl.putConstraint(SpringLayout.NORTH, lblVlVenda, 10, SpringLayout.NORTH, this);
        spl.putConstraint(SpringLayout.WEST, lblVlVenda, 15, SpringLayout.EAST, lblVlCusto);
        
        
        JTextField textCod = new JTextField();
        textCod.setPreferredSize(new Dimension(85, 20));
        this.add(textCod);
        
        JTextField textNome = new JTextField();
        textNome.setPreferredSize(new Dimension(315, 20));
        this.add(textNome);
        
        JComboBox comboGrupo = new JComboBox(new Object[] {"Selecione", "Bebidas"});
        comboGrupo.setPreferredSize(new Dimension(90, 20));
        this.add(comboGrupo);
        
        spl.putConstraint(SpringLayout.NORTH, textCod, 1, SpringLayout.SOUTH, LblCod);
        spl.putConstraint(SpringLayout.WEST, textCod, 8, SpringLayout.WEST, this);
        spl.putConstraint(SpringLayout.NORTH, textNome, 1, SpringLayout.SOUTH, lblNome);
        spl.putConstraint(SpringLayout.WEST, textNome, 8, SpringLayout.EAST, textCod);
        spl.putConstraint(SpringLayout.NORTH, comboGrupo, 1, SpringLayout.SOUTH, lblGrupo);
        spl.putConstraint(SpringLayout.WEST, comboGrupo, 8, SpringLayout.EAST, textNome);
        
        
    }

    private void showMe() {
        //this.pack();
        this.setSize(770,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        //this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    
    
}
