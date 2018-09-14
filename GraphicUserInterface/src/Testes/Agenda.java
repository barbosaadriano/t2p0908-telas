package Testes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Agenda extends JFrame{

    JLabel txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, 
            txt16, txt17, txt18, txt19, txt20, txt21, txt22, txt23, txt24, txt25, txt26, txt27, txt28, 
            txt29, txt30, txt31, txt32, txt33, txt34, txt35, txt36, txt37, txt38, txt39, txt40, txt41, txt42; 
    JTextField  tx1, tx2, tx3, tx4, tx5, tx6, tx7, tx8, tx9, tx10, tx11, tx12, tx13, tx14, tx15, 
            tx16, tx17, tx18, tx19, tx20, tx21, tx22, tx23, tx24, tx25, tx26, tx27, tx28, 
            tx29, tx30, tx31, tx32, tx33, tx34, tx35, tx36, tx37, tx38, tx39, tx40, tx41, tx42;
    
public Agenda()throws HeadlessException{
    
    super("Minha Agenda");
    init(); 
    
}

    private void init() {
        
        this.setLayout(new BorderLayout());
        
        JPanel meupainel = new JPanel(new FlowLayout()); // add um painel.
        meupainel.setBorder(new TitledBorder("Botões")); //coloca borda no painel. 
        this.add(meupainel, BorderLayout.NORTH); 
        
        JComboBox jcb = new JComboBox(new Object[]{"January", "February", 
        "March", "April", "May", "June", "July", "August","September", "October", 
        "November", "December"}); 
        meupainel.add(jcb); 
        
        JButton meubotao = new JButton("Select the mounth"); //coloca botão.
        meupainel.add(meubotao); 
        
        JPanel meuoutropainel = new JPanel(new GridLayout(6,6,2,2)); // add um painel.
        meuoutropainel.setBorder(new TitledBorder("Mounth")); //coloca borda no painel. 
        //this.setLayout(new GridLayout(6,7,2,2));
        this.add(meuoutropainel, BorderLayout.CENTER);
        
        //JPanel dia1 = new JPanel(new BorderLayout());
        this.txt1 = new JLabel(); 
        this.txt1.setText("30");
        this.add(txt1); 
        //this.add(txt1, BorderLayout.NORTH);
        this.tx1= new JTextField(); 
        this.tx1.setPreferredSize(new Dimension(100, 20));
        this.add(tx1); 
       // this.add(tx1, BorderLayout.CENTER); 
        
      //  JPanel dia2 = new JPanel(new BorderLayout());
        this.txt2 = new JLabel(); 
        this.txt2.setText("31");
        this.add(txt2); 
       // this.add(txt2, BorderLayout.NORTH);
        this.tx2= new JTextField(); 
        this.tx2.setPreferredSize(new Dimension(100, 20));
        this.add(tx2); 
       // this.add(tx2, BorderLayout.CENTER); 
        
        
       // JPanel dia3 = new JPanel(new BorderLayout());
        this.txt3 = new JLabel(); 
        this.txt3.setText("1");
        this.add(txt3); 
       // this.add(txt3, BorderLayout.NORTH);
        this.tx3= new JTextField(); 
        this.tx3.setPreferredSize(new Dimension(100, 20));
        this.add(tx3); 
      //  this.add(tx3, BorderLayout.CENTER); 
        
        
       // JPanel dia4 = new JPanel(new BorderLayout());
        this.txt4 = new JLabel(); 
        this.txt4.setText("2");
        this.add(txt4); 
      //  this.add(txt4, BorderLayout.NORTH);
        this.tx4= new JTextField(); 
        this.tx4.setPreferredSize(new Dimension(100, 20));
        this.add(tx4); 
      //  this.add(tx4, BorderLayout.CENTER); 
        
        
       // JPanel dia5 = new JPanel(new BorderLayout());
        this.txt5 = new JLabel(); 
        this.txt5.setText("3");
        this.add(txt5); 
      //  this.add(txt5, BorderLayout.NORTH);
        this.tx5= new JTextField(); 
        this.tx5.setPreferredSize(new Dimension(100, 20));
        this.add(tx5); 
       // this.add(tx5, BorderLayout.CENTER); 
        
        
       // JPanel dia = new JPanel(new BorderLayout());
        this.txt1 = new JLabel(); 
        this.txt1.setText("4");
        this.add(txt1); 
      //  this.add(txt1, BorderLayout.NORTH);
        this.tx1= new JTextField(); 
        this.tx1.setPreferredSize(new Dimension(100, 20));
        this.add(tx1); 
      //  this.add(tx1, BorderLayout.CENTER); 
        
        
        
        
        
        
         this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        
        
    }
    
}
