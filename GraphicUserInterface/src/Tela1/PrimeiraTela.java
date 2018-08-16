/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

/**
 *
 * @author ngnic
 */
public class PrimeiraTela extends JFrame {

    public PrimeiraTela() throws HeadlessException {
        super("Tela Master");
        Begin();
        showMe();
    }

    private void Begin() {
        this.setLayout(new GridLayout(0, 1));

        JPanel meuPainel = new JPanel(new FlowLayout());
        meuPainel.setBorder(new TitledBorder("Dados de Serviço"));
        this.add(meuPainel, BorderLayout.CENTER);
        
        SpringLayout spl = new SpringLayout();
        meuPainel.setLayout(spl);

        JLabel lbCodServ = new JLabel("Código de Serviço:");
        meuPainel.add(lbCodServ);

        JTextField txServ = new JTextField("Não definido");
        meuPainel.add(txServ);

        JLabel lbNomeServ = new JLabel("66666:");
        meuPainel.add(lbNomeServ);

        JTextField txNomeServ = new JTextField("55555555555555555");
        meuPainel.add(txNomeServ);

        JLabel lbDesc = new JLabel("Nome do Serviço:");
        meuPainel.add(lbDesc);

        /*JTextArea taDesc = new JTextArea();
        meuPainel.add(taDesc);*/
        
        JTextField taDesc = new JTextField("TEXT AREA AQUI");
        meuPainel.add(taDesc);
        
        spl.putConstraint(SpringLayout.WEST, txServ, 15, SpringLayout.EAST, lbCodServ);
        spl.putConstraint(SpringLayout.NORTH, lbNomeServ, 15, SpringLayout.SOUTH, lbCodServ);
        spl.putConstraint(SpringLayout.WEST, lbNomeServ, 67, SpringLayout.WEST, lbCodServ);
        spl.putConstraint(SpringLayout.WEST, txNomeServ, 15, SpringLayout.EAST, lbNomeServ);
        spl.putConstraint(SpringLayout.EAST, txNomeServ, -30, SpringLayout.EAST, meuPainel);
        spl.putConstraint(SpringLayout.NORTH, txNomeServ, 10, SpringLayout.SOUTH, txServ);
        spl.putConstraint(SpringLayout.NORTH, lbDesc, 15, SpringLayout.SOUTH, lbNomeServ);
        spl.putConstraint(SpringLayout.WEST, taDesc, 15, SpringLayout.EAST, lbDesc);
        spl.putConstraint(SpringLayout.NORTH, taDesc, 10, SpringLayout.SOUTH, txNomeServ);
        spl.putConstraint(SpringLayout.EAST, taDesc, -30, SpringLayout.EAST, meuPainel);
  

        //////SEGUNDO PAINEL//////
        JPanel secondPanel = new JPanel();
        secondPanel.setBorder(new TitledBorder(""));
        this.add(secondPanel, BorderLayout.CENTER);
        
        SpringLayout spl2 = new SpringLayout();
        secondPanel.setLayout(spl2);
        
        JLabel lbNFS = new JLabel("Código do Serv. NFS-e:");
        secondPanel.add(lbNFS);

        JTextField txNFS = new JTextField("Código do Serv. NFS-eCódigo do Serv. NFS-e");
        secondPanel.add(txNFS);
        
        JLabel lbISS = new JLabel("ISS(%):");
        secondPanel.add(lbISS);

        JTextField txISS = new JTextField("*98989");
        secondPanel.add(txISS);
        
        JLabel lbTrib = new JLabel("Cód. Trib. no Município:");
        secondPanel.add(lbTrib);

        JTextField txTrib = new JTextField("5555");
        secondPanel.add(txTrib);
        
        JLabel lbCNAE = new JLabel("CNAE:");
        secondPanel.add(lbCNAE);

        JTextField txCNAE = new JTextField("5555");
        secondPanel.add(txCNAE);
        
        spl2.putConstraint(SpringLayout.WEST, txNFS, 5, SpringLayout.EAST, lbNFS);
        spl2.putConstraint(SpringLayout.EAST, txNFS, -30, SpringLayout.EAST, secondPanel);
        spl2.putConstraint(SpringLayout.NORTH, lbISS, 10, SpringLayout.SOUTH, lbNFS);
        spl2.putConstraint(SpringLayout.EAST, lbISS, 0, SpringLayout.EAST, lbNFS);
        spl2.putConstraint(SpringLayout.WEST, txISS, 5, SpringLayout.EAST, lbISS);
        spl2.putConstraint(SpringLayout.NORTH, txISS, 0, SpringLayout.NORTH, lbISS);
        spl2.putConstraint(SpringLayout.WEST, lbTrib, 5, SpringLayout.EAST, txISS);
        spl2.putConstraint(SpringLayout.NORTH, lbTrib, 0, SpringLayout.NORTH, lbISS);
        spl2.putConstraint(SpringLayout.WEST, txTrib, 5, SpringLayout.EAST, lbTrib);
        spl2.putConstraint(SpringLayout.NORTH, txTrib, 0, SpringLayout.NORTH, lbTrib);
        spl2.putConstraint(SpringLayout.NORTH, lbCNAE, 0, SpringLayout.NORTH, lbISS);
        spl2.putConstraint(SpringLayout.WEST, lbCNAE, 5, SpringLayout.EAST, txTrib);
        spl2.putConstraint(SpringLayout.NORTH, txCNAE, 0, SpringLayout.NORTH, lbCNAE);
        spl2.putConstraint(SpringLayout.WEST, txCNAE, 5, SpringLayout.EAST,lbCNAE);

    }

    private void showMe() {
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
