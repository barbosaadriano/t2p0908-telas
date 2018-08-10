package br.com.pedroenju;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

public class TelaOne extends JFrame {

    public TelaOne() throws HeadlessException {
        
        super("Serviços X Produtos");
        init();
        telaShow();
        
    }

    private void init() {
        
        this.setLayout(new BorderLayout());
        
        panelTop();
        panelCentral();
    }

    private void telaShow() {
        
        this.pack();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void panelTop() {
        //PAINEL NORTE
        JPanel panelNorth = new JPanel(new BorderLayout());
        panelNorth.setBorder(new TitledBorder(""));
        this.add(panelNorth, BorderLayout.NORTH);
        
        //PAINEL VOLTAR
        JPanel panelBack = new JPanel(new FlowLayout());
        panelNorth.add(panelBack, BorderLayout.WEST);
        //PAINEL BOTÕES
        JPanel panelButtons = new JPanel();
        panelNorth.add(panelButtons, BorderLayout.CENTER);
        //LAYOUT PAINEL BOTÕES
//        SpringLayout layoutButtons = new SpringLayout();
//        panelButtons.setLayout(layoutButtons);
        
        //VOLTAR
        JButton btnBack = new JButton("Voltar");
        panelBack.add(btnBack);
        //LIMPAR
        JButton btnClear = new JButton("Limpar");
        panelButtons.add(btnClear);
//        layoutButtons.putConstraint(SpringLayout.WEST, btnClear, 5, SpringLayout.WEST, panelButtons);
//        layoutButtons.putConstraint(SpringLayout.NORTH, btnClear, 5, SpringLayout.NORTH, panelButtons);
        //INCLUIR
        JButton btnAdd = new JButton("Incluir");
        panelButtons.add(btnAdd);
//        layoutButtons.putConstraint(SpringLayout.WEST, btnAdd, 5, SpringLayout.EAST, btnClear);
//        layoutButtons.putConstraint(SpringLayout.NORTH, btnAdd, 0, SpringLayout.NORTH, btnClear);
        //ALTERAR
        JButton btnEdit = new JButton("Alterar");
        panelButtons.add(btnEdit);
//        layoutButtons.putConstraint(SpringLayout.WEST, btnEdit, 5, SpringLayout.EAST, btnAdd);
//        layoutButtons.putConstraint(SpringLayout.NORTH, btnEdit, 0, SpringLayout.NORTH, btnClear);
        //EXCLUIR
        JButton btnDelete = new JButton("Excluir");
        panelButtons.add(btnDelete);
//        layoutButtons.putConstraint(SpringLayout.WEST, btnDelete, 5, SpringLayout.EAST, btnEdit);
//        layoutButtons.putConstraint(SpringLayout.NORTH, btnDelete, 0, SpringLayout.NORTH, btnClear);
        //PESQUISAR
        JButton btnSearch = new JButton("Pesquisar");
        panelButtons.add(btnSearch);
//        layoutButtons.putConstraint(SpringLayout.WEST, btnSearch, 5, SpringLayout.EAST, btnDelete);
//        layoutButtons.putConstraint(SpringLayout.NORTH, btnSearch, 0, SpringLayout.NORTH, btnClear);
    }

    private void panelCentral() {
        //PAINEL CENTRAL
        JPanel panelCentral = new JPanel(new BorderLayout());
        this.add(panelCentral, BorderLayout.CENTER);
        
        //PAINEL CENTRAL-NORTE
        JPanel panelNorth = new JPanel();
        panelCentral.add(panelNorth, BorderLayout.NORTH);
        //LAYOUT CENTRAL-NORTE
        SpringLayout layoutCentral = new SpringLayout();
        panelNorth.setLayout(layoutCentral);
        //SERVIÇO
        JLabel lbService = new JLabel("Serviço");
        panelNorth.add(lbService);
//        layoutCentral.putConstraint(SpringLayout.WEST, lbService, 25, SpringLayout.WEST, panelNorth);
//        layoutCentral.putConstraint(SpringLayout.NORTH, lbService, 20, SpringLayout.NORTH, panelNorth);
        //SERVIÇO CÓDIGO
        JTextField txtCodeServ = new JTextField();
        panelNorth.add(txtCodeServ);
        txtCodeServ.setSize(100, 35);
//        layoutCentral.putConstraint(SpringLayout.WEST, txtCodeServ, 10, SpringLayout.EAST, lbService);
//        layoutCentral.putConstraint(SpringLayout.NORTH, txtCodeServ, 0, SpringLayout.NORTH, lbService);
        //SERVIÇO CAMPO
        JTextField txtServ = new JTextField();
        panelNorth.add(txtServ);
//        layoutCentral.putConstraint(SpringLayout.WEST, txtServ, 10, SpringLayout.EAST, txtCodeServ);
//        layoutCentral.putConstraint(SpringLayout.NORTH, txtServ, 0, SpringLayout.NORTH, lbService);
        
        //PAINEL SUL
        JPanel panelSouth = new JPanel(new FlowLayout());
        panelCentral.add(panelSouth, BorderLayout.SOUTH);
        JButton btnDEBUG = new JButton("SOMENTE UM TESTE");
        panelSouth.add(btnDEBUG);
    }

    
    
}
