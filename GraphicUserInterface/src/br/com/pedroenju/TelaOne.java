package br.com.pedroenju;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

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
        this.setExtendedState(MAXIMIZED_BOTH);
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
        SpringLayout layoutButtons = new SpringLayout();
        panelButtons.setLayout(layoutButtons);

        //VOLTAR
        JButton btnBack = new JButton("Voltar");
        panelBack.add(btnBack);
        //LIMPAR
        JButton btnClear = new JButton("Limpar");
        panelButtons.add(btnClear);
        layoutButtons.putConstraint(SpringLayout.WEST, btnClear, 5, SpringLayout.WEST, panelButtons);
        layoutButtons.putConstraint(SpringLayout.NORTH, btnClear, 5, SpringLayout.NORTH, panelButtons);
        //INCLUIR
        JButton btnAdd = new JButton("Incluir");
        panelButtons.add(btnAdd);
        layoutButtons.putConstraint(SpringLayout.WEST, btnAdd, 5, SpringLayout.EAST, btnClear);
        layoutButtons.putConstraint(SpringLayout.NORTH, btnAdd, 0, SpringLayout.NORTH, btnClear);
        //ALTERAR
        JButton btnEdit = new JButton("Alterar");
        panelButtons.add(btnEdit);
        layoutButtons.putConstraint(SpringLayout.WEST, btnEdit, 5, SpringLayout.EAST, btnAdd);
        layoutButtons.putConstraint(SpringLayout.NORTH, btnEdit, 0, SpringLayout.NORTH, btnClear);
        //EXCLUIR
        JButton btnDelete = new JButton("Excluir");
        panelButtons.add(btnDelete);
        layoutButtons.putConstraint(SpringLayout.WEST, btnDelete, 5, SpringLayout.EAST, btnEdit);
        layoutButtons.putConstraint(SpringLayout.NORTH, btnDelete, 0, SpringLayout.NORTH, btnClear);
        //PESQUISAR
        JButton btnSearch = new JButton("Pesquisar");
        panelButtons.add(btnSearch);
        layoutButtons.putConstraint(SpringLayout.WEST, btnSearch, 5, SpringLayout.EAST, btnDelete);
        layoutButtons.putConstraint(SpringLayout.NORTH, btnSearch, 0, SpringLayout.NORTH, btnClear);
    }

    private void panelCentral() {
        //PAINEL CENTRAL
        JPanel panelCentral = new JPanel(new BorderLayout());
        this.add(panelCentral, BorderLayout.CENTER);

        //PAINEL CENTRAL-NORTE
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new GridLayout(3, 3, 10, 10));
        panelCentral.add(panelNorth, BorderLayout.NORTH);
        
        //SERVIÇO
        JLabel lbService = new JLabel("Serviço");
        panelNorth.add(lbService, 0);
        //SERVIÇO CÓDIGO
        JTextField txtCodServ = new JTextField();
        txtCodServ.setSize(100, 35);
        panelNorth.add(txtCodServ, 1);
        //SERVIÇO CAMPO
        JTextField txtServ = new JTextField();
        txtServ.setSize(500, 35);
        panelNorth.add(txtServ, 2);
        
        //PRODUTO
        JLabel lbCodProduto = new JLabel("Cod.Produto");
        panelNorth.add(lbCodProduto, 3);
        //CÓDIGO PRODUTO
        JTextField txtCodProduto = new JTextField();
        txtCodProduto.setSize(100, 35);
        panelNorth.add(txtCodProduto, 4);
        //PRODUTO CAMPO
        JTextField txtProduto = new JTextField();
        txtProduto.setSize(300, 35);
        panelNorth.add(txtProduto, 5);
        
        //QUANTIDADE
        JLabel lbQuantidade = new JLabel("Qtd.Prevista");
        panelNorth.add(lbQuantidade, 6);
        //QUANTIDADE CAMPO
        JTextField txtQuantidade = new JTextField();
        txtQuantidade.setSize(100, 35);
        panelNorth.add(txtQuantidade, 7);
        
        
        //PAINEL CENTRAL-SUL
        JPanel panelSouth = new JPanel(new BorderLayout());
        panelCentral.add(panelSouth, BorderLayout.CENTER);
        
        JTable tabela = new JTable();
        JScrollPane panelScroll = new JScrollPane(tabela);
        panelSouth.add(panelScroll);
        DefaultTableModel tm = new DefaultTableModel(new Object[]{"Código", "Serviço", "Cod.Produto", "Produto", "Quantidade Prevista"}, 0);
        tabela.setModel(tm);
        panelScroll.setPreferredSize(new Dimension(400, 300));
        tm.addRow(new Object[]{"000004", "Troca do Óleo", "000007", "Óleo", "5,00"});
    }

}
