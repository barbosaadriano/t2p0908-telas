package br.com.lucasj;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

public class Tela extends JFrame {
    
    public Tela() throws HeadlessException {
        super("Minha super tela!");
        init();
        showMe();
    }
    
    private void init() {
        JPanel meuPainel = new JPanel(new FlowLayout());
        meuPainel.setBorder(new TitledBorder("Botões"));
        this.add(meuPainel, BorderLayout.SOUTH);
        
        JButton meuBotao = new JButton("Meu incrivel botão!");
        meuPainel.add(meuBotao);
        
        JPanel meuOutroPainel = new JPanel();
        this.add(meuOutroPainel, BorderLayout.CENTER);
        
        SpringLayout spl = new SpringLayout();
        meuOutroPainel.setLayout(spl);
        
        JLabel labelzinha = new JLabel("Eu sou uma label!");
        meuOutroPainel.add(labelzinha);
        
        JComboBox jcb = new JComboBox(new Object[]
        {"Selecione", "Op 2", "Op 3", "Op 4"});
        
        meuOutroPainel.add(jcb);
        spl.putConstraint(SpringLayout.WEST, jcb, 5, SpringLayout.WEST, labelzinha);
        spl.putConstraint(SpringLayout.NORTH, jcb, 5, SpringLayout.SOUTH, labelzinha);
        
        spl.putConstraint("East", jcb, -100, "East", meuOutroPainel);
        
    }
    
    private void showMe() {
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
}
