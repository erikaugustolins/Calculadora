package grafic;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class FrmCalculadora  extends JFrame{
    private JTextField txtNum;
    private JTextField txtTNum;
    private JComboBox <String> cmbaction;
    private JButton btnCalcular;
    private JComboBox<String> CMBOperador;



public FrmCalculadora (){
    setSize(new Dimension(240, 140));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
        setLocationRelativeTo(null);

        add(new JLabel("X:"));
        add(txtTNum = new JTextField(7));

        add(new JLabel("Y:"));
        add(txtNum = new JTextField(7));

        


        add(new JLabel("Operação:"));
        
        String items[] = {"Soma", "Subtração", "Divisão", "Multiplicação "};
        add(CMBOperador = new JComboBox<String>(items));

        add(btnCalcular = new JButton("Calcular"));
    
        ActionCalcular action = new ActionCalcular (CMBOperador,txtTNum,txtNum);
        btnCalcular.addActionListener(action);

    
}
}