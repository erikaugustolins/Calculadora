package grafic;
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



public FrmCalculadora (){
    setSize(new Dimension(240, 160));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        add(new JLabel("Valor 1:"));
        add(txtTNum = new JTextField(15));

        add(new JLabel("Valor 2:"));
        add(txtNum = new JTextField(15));

}
}