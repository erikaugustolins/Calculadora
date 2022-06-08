package grafic;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Logica.Soma;
import Logica.Multiplicacao;
import Logica.Division;
import Logica.Subtrair;

public class ActionCalcular extends AbstractAction
{
    private JComboBox <String> cmbAction;
    private JTextField txtTnum;
    private JTextField txtNum;
    public ActionCalcular () {

}

public ActionCalcular (JComboBox <String> cmbAction, JTextField txtTnum, JTextField txtNum)
{
    this.cmbAction = cmbAction;
    this.txtTnum = txtTnum;
    this.txtNum = txtNum;
}

public JComboBox getCmbAction()
{
    return cmbAction;
}

public void setCmbAction(JComboBox cmbAction) {
    this.cmbAction = cmbAction;
}

public JTextField getTxtNum() {
    return txtNum;
}
}
