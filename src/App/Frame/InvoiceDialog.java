
package App.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

   
public class InvoiceDialog extends JDialog {
    private JTextField custNameField;
    private JTextField invDateField;
    private JLabel custLab;
    private JLabel  dateLab;
    private JButton okBtn;
    private JButton cancelBtn;

    public InvoiceDialog(NewFrame frame) {
        custLab = new JLabel("Customer Name:");
        custNameField = new JTextField(20);
        dateLab = new JLabel("Invoice Date:");
        invDateField = new JTextField(20);
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createInvoiceOK");
        cancelBtn.setActionCommand("createInvoiceCancel");
        
        okBtn.addActionListener(frame.getControl());
        cancelBtn.addActionListener(frame.getControl());
        setLayout(new GridLayout(3, 2));
        
        add( dateLab);
        add(invDateField);
        add(custLab);
        add(custNameField);
        add(okBtn);
        add(cancelBtn);
        
        pack();
        
    }

    public JTextField getCustNameField() {
        return custNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }
    
}
