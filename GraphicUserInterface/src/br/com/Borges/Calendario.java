package br.com.Borges;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Erica
 */
public class Calendario extends JFrame{

    public Calendario() throws HeadlessException {
        super("Calendario");
        init();
    }

    private void init() {
        this.setLayout(new BorderLayout());
        
        JPanel meuPainel = new JPanel(new FlowLayout());
        meuPainel.setBorder(new TitledBorder(""));
        this.add(meuPainel,BorderLayout.NORTH);
        
        //SpringLayout spl = new SpringLayout(); 
        //meuPainel.setLayout(spl);
        
        JLabel label = new JLabel("Navegação");
        meuPainel.add(label);
         
        JComboBox jcb = new JComboBox(new Object[]{"Janeiro","Fevereiro", "Março", "..."}); 
        meuPainel.add(jcb);
       // spl.putConstraint(SpringLayout.WEST, jcb, 5, SpringLayout.WEST, label);
       // spl.putConstraint(SpringLayout.NORTH, jcb, 2, SpringLayout.SOUTH, label);
        
        JButton meuBotao = new JButton("Pesquisar");
        meuPainel.add(meuBotao);
        
        JPanel panelGrid = new JPanel();
        panelGrid.setBorder(new TitledBorder("Mês"));
        this.add(panelGrid,BorderLayout.CENTER);
        
        this.setLayout(new GridLayout(5,7,1,1));
       
        
        
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    
    
}
