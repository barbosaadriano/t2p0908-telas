package br.com.nicolasg;

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

public class Teste extends JFrame{

    public Teste() throws HeadlessException {
        super("Minha Tela God");
        init();
        showMe();
    }

    private void init() {
        this.setLayout(new BorderLayout());
        
        JPanel meuPainel = new JPanel(new FlowLayout());
        meuPainel.setBorder(new TitledBorder("Carlos"));
        this.add(meuPainel, BorderLayout.SOUTH);
        
        JButton meuBotao = new JButton("Botãozão");
        meuPainel.add(meuBotao);
        
        JPanel secondPanel = new JPanel();
        this.add(secondPanel,BorderLayout.CENTER);
        
        SpringLayout spl = new SpringLayout();
        secondPanel.setLayout(spl);
        
        JLabel minhaLabel = new JLabel("Label");
        secondPanel.add(minhaLabel);
        
        JComboBox meuComboBox = new JComboBox(new Object[]{
            "Selecione","João","Carlos","Rodrigo"});
        secondPanel.add(meuComboBox);
        
        spl.putConstraint(SpringLayout.WEST, meuComboBox, 5, SpringLayout.WEST, minhaLabel);
    spl.putConstraint(SpringLayout.NORTH, meuComboBox, 5, SpringLayout.SOUTH, minhaLabel);       
    }

    private void showMe() {
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }
       
}
