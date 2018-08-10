package br.com.thiagohc;

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

/**
 *
 * @author thiag
 */
public class Teste extends JFrame {

    public Teste() throws HeadlessException {
        super("Minha Tela");
        init();
        showMe();
        
    }

    private void init() {
       this.setLayout(new BorderLayout());
       
        JPanel meuPainel = new JPanel(new FlowLayout());
        meuPainel.setBorder(new TitledBorder("Botões"));
        this.add(meuPainel, BorderLayout.NORTH);
        
        JButton meuBotao = new JButton("Meu Botão");
        meuPainel.add(meuBotao);
        
        JPanel meuOutroPainel = new JPanel();
        this.add(meuOutroPainel, BorderLayout.CENTER);
        
        SpringLayout spl = new SpringLayout();
        meuOutroPainel.setLayout(spl);
        
        JLabel labelzinha = new JLabel ("Eu Sou Uma Label");
        meuOutroPainel.add(labelzinha);
        
        JComboBox jcb = new JComboBox(new Object[]{
            "Selecione",
            "Opção 1",
            "Opção 2",
            "Opção n"
        });
        meuOutroPainel.add(jcb);
        spl.putConstraint(SpringLayout.WEST, jcb, 5, SpringLayout.WEST, labelzinha);
        spl.putConstraint(SpringLayout.WEST, jcb, 5, SpringLayout.WEST, labelzinha);
        
        
    }

    private void showMe() {
       this.pack();
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.setVisible(true);
       this.setExtendedState(MAXIMIZED_BOTH);
    }
    
}
