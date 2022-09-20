
package App.Frame;

import App.Control.Control;
import App.Model.Header;
import App.Model.TableModel;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;


public class NewFrame extends javax.swing.JFrame {

   
    public NewFrame() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        HeaderTab = new javax.swing.JTable();
        HeaderTab.getSelectionModel().addListSelectionListener(control);
        jScrollPane2 = new javax.swing.JScrollPane();
        ItemTab = new javax.swing.JTable();
        ItemTab.getSelectionModel().addListSelectionListener(control);
        createInvoice = new javax.swing.JButton();
        createInvoice.addActionListener(control);
        removeBtm = new javax.swing.JButton();
        removeBtm.addActionListener(control);
        addBtm = new javax.swing.JButton();
        addBtm.addActionListener(control);
        deleteBtm = new javax.swing.JButton();
        deleteBtm.addActionListener(control);
        num = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numLab = new javax.swing.JLabel();
        dateLab = new javax.swing.JLabel();
        custLab = new javax.swing.JLabel();
        totalLab = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        openFile.addActionListener(control);
        saveButton = new javax.swing.JMenuItem();
        saveButton.addActionListener(control);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(HeaderTab);

        ItemTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(ItemTab);

        createInvoice.setText("create Invoice");
        createInvoice.setActionCommand("create Invoice");
        createInvoice.setAutoscrolls(true);
        createInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createInvoiceActionPerformed(evt);
            }
        });

        removeBtm.setText("remove invoice");
        removeBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtmActionPerformed(evt);
            }
        });

        addBtm.setText("add item");

        deleteBtm.setText("delete item");
        deleteBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtmActionPerformed(evt);
            }
        });

        num.setText("invoice num");

        jLabel2.setText("invoice date ");

        jLabel3.setText("customer name");

        jLabel4.setText("invoice total");

        numLab.setText(".");

        dateLab.setText(".");

        custLab.setText(".");

        totalLab.setText(".");

        jMenu1.setText("File");

        openFile.setText("open File");
        openFile.setActionCommand("open File");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveButton.setText("save file");
        jMenu1.add(saveButton);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(createInvoice)
                .addGap(46, 46, 46)
                .addComponent(removeBtm)
                .addGap(129, 129, 129)
                .addComponent(addBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(deleteBtm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(num))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numLab, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalLab, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(custLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dateLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)))
                        .addContainerGap(222, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num)
                            .addComponent(numLab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dateLab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(custLab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalLab))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeBtm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createInvoice)
                        .addComponent(addBtm)
                        .addComponent(deleteBtm)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeBtmActionPerformed

    private void createInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createInvoiceActionPerformed

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openFileActionPerformed

    private void deleteBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtmActionPerformed

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HeaderTab;
    private javax.swing.JTable ItemTab;
    private javax.swing.JButton addBtm;
    private javax.swing.JButton createInvoice;
    private javax.swing.JLabel custLab;
    private javax.swing.JLabel dateLab;
    private javax.swing.JButton deleteBtm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel num;
    private javax.swing.JLabel numLab;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JButton removeBtm;
    private javax.swing.JMenuItem saveButton;
    private javax.swing.JLabel totalLab;
    // End of variables declaration//GEN-END:variables

private ArrayList <Header> headers ;   
private Control control = new Control(this);
private TableModel tableModel ;

    public ArrayList<Header> getHeaders() {
        if (headers == null) headers = new ArrayList<>();
        return headers;

    }

    public void setHeaders(ArrayList<Header> headers) {
        this.headers = headers;
    }
        
     public TableModel getTableModel() {
        if (tableModel == null) {
            tableModel = new TableModel(getHeaders());
        }
        return tableModel;
    }
    public void setTableModel(TableModel tableModel) {
        this.tableModel = tableModel;
    }
    public JLabel getCustLab() {
        return custLab;
    }

    public JLabel getDateLab() {
        return dateLab;
    }

    public JTable getHeaderTab() {
        return HeaderTab;
    }

    public JTable getItemTab() {
        return ItemTab;
    }

    public JLabel getNumLab() {
        return numLab;
    }

    public JLabel getTotalLab() {
        return totalLab;
    }

    public Control getControl() {
        return control;
    }

    public Object getItemTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object TableModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     public int getNextInvoiceNum() {
        int num = 0;
       
       for (Header header : getHeaders()) {
            if (header.getNum() > num) 
                num = header.getNum();
        }
        
        return ++num;
    }
    
  
}
