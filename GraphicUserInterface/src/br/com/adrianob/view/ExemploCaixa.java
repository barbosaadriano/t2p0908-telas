package br.com.adrianob.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.Date;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.TitledBorder;

/**
 *
 * @author drink
 */
public class ExemploCaixa extends JFrame {

    public ExemploCaixa() {
        super("Caixa");
        init();
    }

    private void init() {
        this.setLayout(new BorderLayout(5, 5));
        pnTitulo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblTitulo = new JLabel("Lançamento no Caixa");
        Font f = new Font(Font.SANS_SERIF, Font.BOLD, 26);
        lblTitulo.setFont(f);
        pnTitulo.setBackground(Color.RED);
        lblTitulo.setForeground(Color.white);
        pnTitulo.add(lblTitulo);
        this.add(pnTitulo, BorderLayout.NORTH);
        
        pnCampos = new JPanel(new BorderLayout(0,10));
        pnCampos.setBorder(new TitledBorder(""));
        
        JPanel campos = new JPanel(new GridLayout(0,2));
        pnCampos.add(campos,BorderLayout.CENTER);
        JLabel lblData = new JLabel("Data Lançamento");
        JFormattedTextField jft = new JFormattedTextField();
        jft.setValue(new Date());
        campos.add(lblData);
        campos.add(jft);
        
        

        JLabel lblPc = new JLabel("Plano de contas");
        JComboBox combo = new JComboBox(new Object[]{"Moradia","Transporte","..."});
        campos.add(lblPc);
        campos.add(combo);
        
        JLabel lblHist = new JLabel("Histórico");
        JTextField txtHist = new JTextField();
        campos.add(lblHist);
        campos.add(txtHist);
        
        JLabel lblDoc = new JLabel("Documento");
        JTextField txtDoc = new JTextField();
        campos.add(lblDoc);
        campos.add(txtDoc);
        
        JLabel lblVenci = new JLabel("Vencimento");
        JFormattedTextField txtVenci = new JFormattedTextField();
        txtVenci.setValue(new Date());
        campos.add(lblVenci);
        campos.add(txtVenci);
        
        JLabel lblEntrada = new JLabel("Entrada");
        JFormattedTextField txtEntrada = new JFormattedTextField();
        txtVenci.setValue(0.0f);
        campos.add(lblEntrada);
        campos.add(txtEntrada);
        
        JLabel lblSaida = new JLabel("Saída");
        JFormattedTextField txtSaida = new JFormattedTextField();
        txtVenci.setValue(0.0f);
        campos.add(lblSaida);
        campos.add(txtSaida);
        
        JButton btnx = new JButton("Imprimir Fluxo de Caixa");
        pnCampos.add(btnx,BorderLayout.SOUTH);
               
        this.add(pnCampos, BorderLayout.CENTER);

        pnControles = new JPanel(new GridLayout(0, 1));
        pnControles.setBorder(new TitledBorder("Funções:"));

        for (String btnName : btnNames) {
            JButton btn = new JButton(btnName);
            btn.setActionCommand(btnName);
            pnControles.add(btn);
        }
        this.add(pnControles, BorderLayout.EAST);

        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    /**
     * Minhas variáveis
     */
    private JPanel pnTitulo;
    private JPanel pnCampos;
    private JPanel pnControles;

    private final String[] btnNames = {"Editar", "Novo", "Excluir", "Gravar", "Cancelar", "Atualizar", "Lançamentos", "Saldos", "Fechar"};

}
