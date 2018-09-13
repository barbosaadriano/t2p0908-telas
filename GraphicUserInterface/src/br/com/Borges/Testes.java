package br.com.Borges;

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
 * @author Erica
 */
public class Testes extends JFrame{

    public Testes() throws HeadlessException {
        super("Minha tela!");
        init();
        showMe (); //para exibir a tela
    }

    private void init() {
        this.setLayout(new BorderLayout());
        
        JPanel meuPainel = new JPanel(new FlowLayout());
        meuPainel.setBorder(new TitledBorder("botoes"));  //colocando bordas no painel
        this.add(meuPainel,BorderLayout.NORTH);
        
        JButton meuBotao = new JButton("Meu incrivel botao!");
        meuPainel.add(meuBotao); //painel recebe o botao
        
        JPanel meuOutroPainel = new JPanel(); //criando outro painel
        this.add(meuOutroPainel,BorderLayout.CENTER); //colocando ele no centro
        
        SpringLayout spl = new SpringLayout(); //criando um layout
        meuOutroPainel.setLayout(spl);
        
        JLabel labelzinha = new JLabel("Eu sou uma label");
        meuOutroPainel.add(labelzinha);
        
        JComboBox jcb = new JComboBox(new Object[]{"Selecione","Opção 1", "Opção 2", "Opção n..."}); //criando array de objetos e passa o valor
        meuOutroPainel.add(jcb);
        spl.putConstraint(SpringLayout.WEST, jcb, 5, SpringLayout.WEST, labelzinha); //restringindo posição dos objetos
        spl.putConstraint(SpringLayout.NORTH, jcb, 2, SpringLayout.SOUTH, labelzinha);
     
        spl.putConstraint("East", jcb, -100, "East", meuOutroPainel); //fixando o combobox de maneira que acompanhe o tamanho da tela
    }

    private void showMe() {
           this.pack();
           this.setDefaultCloseOperation(EXIT_ON_CLOSE);
           this.setLocationRelativeTo(null); //centralizar a tela
           this.setVisible(true);
           this.setExtendedState(MAXIMIZED_BOTH); //para deixar tela maximizada
    }
    
    
    
}
