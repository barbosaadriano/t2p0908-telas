package Testes;

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

public class Teste extends JFrame{
    
    public Teste() throws HeadlessException{
        super ("minha tela awesome!"); 
        init(); 
        showMe(); 
        
    }

    private void init() {
        this.setLayout(new BorderLayout()); // extremidades.
        
        JPanel meupainel = new JPanel(new FlowLayout()); // add um painel.
        meupainel.setBorder(new TitledBorder("Botões")); //coloca borda no painel. 
        this.add(meupainel, BorderLayout.NORTH); 
        
        JButton meubotao = new JButton("my increible button!"); //coloca botão.
        meupainel.add(meubotao); 
        
        // ----------------------------------// 
        
        JPanel meuoutropainel = new JPanel(); // add outro painel.
        this.add(meuoutropainel, BorderLayout.CENTER);
        
        SpringLayout spl = new SpringLayout(); 
        meuoutropainel.setLayout(spl);
        
        JLabel labelzinha = new JLabel("I'm a label!"); // cria uma label
        meuoutropainel.add(labelzinha); // adiciona a label ao painel
        
        JComboBox jcb = new JComboBox(new Object[]{"Select", "Option 1", 
        "Option 2", "Option N"}); 
        meuoutropainel.add(jcb); 
        spl.putConstraint(SpringLayout.WEST, jcb, 5, SpringLayout.WEST, labelzinha);
        
        spl.putConstraint(SpringLayout.NORTH, jcb, 2, SpringLayout.SOUTH, labelzinha);
        
        spl.putConstraint("West", labelzinha, 100, "West", meuoutropainel);
        
        spl.putConstraint("East", jcb, -100, "East", meuoutropainel);
        
        
     }

    private void showMe() {
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
}
