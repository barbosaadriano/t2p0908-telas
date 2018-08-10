/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marlenis;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author Marlon
 */
public class CadastrodeAnimais extends JFrame {

    public CadastrodeAnimais() throws HeadlessException {

        super("Cadastro de Animais");
        visual();
        exibir();
    }

    private void visual() {

        this.setLayout(new BorderLayout());

        JPanel superior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.add(superior, BorderLayout.NORTH);

        JButton salvar = new JButton("Salvar");
        superior.add(salvar);

        JButton alterar = new JButton("Alterar");
        superior.add(alterar);

        JTabbedPane TelasCadastro = new JTabbedPane();
        this.add(TelasCadastro);

        JPanel cadastro = new JPanel(new BorderLayout());
        TelasCadastro.addTab("CADASTRO", cadastro);

        JPanel grid = new JPanel(new GridLayout(0, 4));
        cadastro.add(grid,BorderLayout.NORTH);

        JLabel lnome = new JLabel("Nome:");
        grid.add(lnome);

        JLabel lapelido = new JLabel("Apelido:");
        grid.add(lapelido);

        JLabel lespecie = new JLabel("Espécie:");
        grid.add(lespecie);

        JLabel lraça = new JLabel("Raça:");
        grid.add(lraça);

        JTextField nome = new JTextField();
        grid.add(nome);

        JTextField apelido = new JTextField();
        grid.add(apelido);
        
        JTextField Espécie = new JTextField();
        grid.add(Espécie);
        
        JTextField Raça = new JTextField();
        grid.add(Raça);
    }

    private void exibir() {

        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

}
