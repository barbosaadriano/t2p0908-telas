package br.com.lucasj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;

public class TelaCaixa extends JFrame {
    
    public TelaCaixa() throws HeadlessException, ParseException {
        super("Caixa");
        init();
        showMe();
    }
    
    private void init() throws ParseException {
        this.setLayout(new BorderLayout());
        
        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.red);
        this.add(infoPanel, BorderLayout.NORTH);
        
        JLabel infoLabel = new JLabel("Lançamentos do Caixa");
        infoLabel.setForeground(Color.WHITE);
        Font infoLabelFont = new Font("Arial", 0, 24);
        infoLabel.setFont(infoLabelFont);
        infoPanel.add(infoLabel);
        
        JPanel southGeneralPanel = new JPanel();
        southGeneralPanel.setBackground(Color.BLUE);
        
        this.add(southGeneralPanel, BorderLayout.CENTER);
        southGeneralPanel.setLayout(new FlowLayout());

        //
        JPanel lancamentoPanel = new JPanel();
        lancamentoPanel.setBorder(new TitledBorder(""));
        SpringLayout spring = new SpringLayout();
        lancamentoPanel.setLayout(spring);
        southGeneralPanel.add(lancamentoPanel, CENTER_ALIGNMENT);
        lancamentoPanel.setPreferredSize(new Dimension(500, 600));
        //

        JLabel lbDataLancamento = new JLabel("Data Lançamento");
        JFormattedTextField edDataLancamento = new JFormattedTextField(new MaskFormatter("##/##/####"));
        JLabel lbPlanoContas = new JLabel("Plano de Contas");
        JComboBox comboPlanoContas = new JComboBox(new Object[]{"=> Informe a Conta..."});
        JLabel lbHistorico = new JLabel("Histórico");
        JTextField edHistorico = new JTextField();
        JLabel lbDocumento = new JLabel("Documento");
        JTextField edDocumento = new JTextField();
        JLabel lbVencimento = new JLabel("Vencimento");
        JFormattedTextField edVencimento = new JFormattedTextField(new MaskFormatter("##/##/####"));
        JLabel lbVlrEntrada = new JLabel("Vlr. Entrada");
        JTextField edVlrEntrada = new JTextField();
        JLabel lbVlrSaida = new JLabel("Vlr. Saída");
        JTextField edVlrSaida = new JTextField();
        
        ArrayList<Component> myFuckingComponents = new ArrayList<>();
        myFuckingComponents.add(lbDataLancamento);
        myFuckingComponents.add(edDataLancamento);
        myFuckingComponents.add(lbPlanoContas);
        myFuckingComponents.add(comboPlanoContas);
        myFuckingComponents.add(lbHistorico);
        myFuckingComponents.add(edHistorico);
        myFuckingComponents.add(lbDocumento);
        myFuckingComponents.add(edDocumento);
        myFuckingComponents.add(lbVencimento);
        myFuckingComponents.add(edVencimento);
        myFuckingComponents.add(lbVlrEntrada);
        myFuckingComponents.add(edVlrEntrada);
        myFuckingComponents.add(lbVlrSaida);
        myFuckingComponents.add(edVlrSaida);
        
        for (int i = 0; i < myFuckingComponents.size(); i++) {
            Component tmp = myFuckingComponents.get(i);
            lancamentoPanel.add(tmp);
            if (i == 0) {
                spring.putConstraint(SpringLayout.VERTICAL_CENTER, tmp, 0, SpringLayout.VERTICAL_CENTER, lancamentoPanel);
                //spring.putConstraint(SpringLayout.NORTH, tmp, 20, SpringLayout.SOUTH, lancamentoPanel);
            } else {
                spring.putConstraint(SpringLayout.WEST, tmp, 0, SpringLayout.WEST, myFuckingComponents.get(i - 1));
                spring.putConstraint(SpringLayout.NORTH, tmp, 0, SpringLayout.SOUTH, myFuckingComponents.get(i - 1));
            }
        }
        
        JButton btImprimir = new JButton("Imprimir Fluxo de Caixa");
        
    }
    
    private void showMe() {
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
