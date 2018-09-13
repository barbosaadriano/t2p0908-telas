/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rff;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author refra
 */
public class Caixa extends JFrame {
    public Caixa(){
        super ("Caixa");
        init();
        showMe();
    }

    private void init() {
        this.setLayout(new BorderLayout(5, 5));
        JPanel pnCabeçalho = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblCabeçalho = new JLabel("LANÇAMENTOS PARA O CAIXA");
        Font f = new Font(Font.SANS_SERIF, Font.BOLD, 26);
        lblCabeçalho.setFont(f);
        pnCabeçalho.setBackground(Color.BLUE);
        lblCabeçalho.setForeground(Color.YELLOW);
        pnCabeçalho.add(lblCabeçalho);
        this.add(pnCabeçalho, BorderLayout.NORTH);
        
        pnCampos = new JPanel(new BorderLayout(0,10));
        pnCampos.setBorder(new TitledBorder(""));
        
        
        
         
    }

    private void showMe() {
        
      this.pack();
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setLocationRelativeTo(null);
      this.setVisible(true);
      this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    
    
    
}
