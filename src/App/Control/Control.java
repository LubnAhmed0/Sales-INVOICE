package App.Control;

import App.Frame.InvoiceDialog;
import App.Frame.ItemDialog;
import App.Frame.NewFrame;
import App.Model.Header;
import App.Model.Item;
import App.Model.ItemTable;
import App.Model.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Control implements ActionListener ,ListSelectionListener {   
   
    private NewFrame frame ;
    private InvoiceDialog invoiceDialog;
    private ItemDialog itemDialog;
   
     public Control(NewFrame frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e. getActionCommand();
        System.out.println("ACTION"+ actionCommand);
        switch(actionCommand){
            case " open File " : 
                openFile();
                break;
            case  " create Invoice": 
               createInvoice();
               break;
            case  " remove Btm " :
                removeBtm();
                break;
            
            case   "  add Btm " : 
                addBtm();
                break;
           
            case  " delete Btm":            
                deleteBtm();
                break;
            case " save Button" : 
                saveButton();
                break;
            case "createInvoiceCancel":
                createInvoiceCancel();
                break;
            case "createInvoiceOK":
                createInvoiceOK();
                break;
            case "createLineOK":
                createLineOK();
                break;
            case "createLineCancel":
                createLineCancel();
                break;
       }  
    }
       @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedIndex = frame.getTableModel().getSelectedRow();
        if(selectedIndex!= -1){
        System.out.println(" you have selected row "+ selectedIndex );
        Header currentHeader = frame.getHeaders().get(selectedIndex);
        frame.getDateLab().setText(""+ currentHeader.getDate());
        frame.getNumLab().setText(""+currentHeader.getNum());
        frame.getCustLab().setText(currentHeader.getName());
        frame.getTotalLab().setText(""+currentHeader.getHeaderTotal());
        ItemTable itemsTable = new ItemTable(currentHeader.getItems());
        frame.getItemTab().setModel(itemsTable);
        itemsTable.fireTableDataChanged();
        }
    }
    private void openFile() {
         JFileChooser fc = new JFileChooser();
        try {
            int result = fc.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headerFile = fc.getSelectedFile();
                Path headerPath = Paths.get(headerFile.getAbsolutePath());
                List<String> headerLines = Files.readAllLines(headerPath);
                System.out.println("Invoices have been read");
         ArrayList<Header>headerArray = new ArrayList<>();
             for(String headerLine : headerLines ){
            String[] headerParts = headerLine.split(",");
            int num =Integer.parseInt(headerParts[0]);
            String date = headerParts[1];
            String name = headerParts[2];
            
            Header header = new Header ( num,date , name);
            headerArray.add(header);
         }
            System.out.println("check point");
            result = fc.showOpenDialog(frame);
            if ( result == JFileChooser.APPROVE_OPTION){
                File itemFile = fc.getSelectedFile();
                Path itemPath = Paths.get(itemFile.getAbsolutePath());
                List<String> itemLines = Files.readAllLines(itemPath);
                System.out.println("Lines have been read");
                for ( String itemLine : itemLines){
                    String[] itemParts= itemLine.split(",");
                    int num =Integer.parseInt(itemParts[0]);
                    String obj = itemParts[1];
                    double price = Double.parseDouble(itemParts[2]);
                    int count = Integer.parseInt( itemParts[3]);
                    Header inv = null;
                    for (Header header : headerArray){
                        if (header.getNum()== num){
                            inv = header ;
                            break;
                         }
                     }
                     Item item = new Item ( obj , price , count ,inv);
                     inv.getItems().add(item);
                 }
                 System.out.println("check point");
        }
        frame.setHeaders(headerArray);
        TableModel tableModel = new TableModel(headerArray);
        frame.setTableModel(tableModel);
        frame.getHeaderTab().setModel(tableModel);
        frame.getTableModel().fireTableDataChanged();
         }
         } 
        catch(IOException ex){
           ex.printStackTrace();
        }   
    }

    private void createInvoice() {
         invoiceDialog = new InvoiceDialog(frame);
        invoiceDialog.setVisible(true);
                }

    private void removeBtm() {
    int selectedRow = frame.getItemTab().getSelectedRow();
    if (selectedRow != -1){
        frame.getHeaderTab().remove(selectedRow);
        frame.getTableModel().fireTableDataChanged();
    }
        
    }

    private void addBtm() {
        itemDialog = new ItemDialog(frame);
        itemDialog.setVisible(true);
        
    }

    private void deleteBtm() {
 
    
     int selectedRow = frame.getItemTab().getSelectedRow();

        if (selectedRow != -1) {
            ItemTable itemTable = (ItemTable) frame.getItemTab().getModel();
            itemTable.getItems().remove(selectedRow);
            itemTable.fireTableDataChanged();
            frame.getTableModel().fireTableDataChanged();
    }
    }
       private void createInvoiceCancel() {
        invoiceDialog.setVisible(false);
        invoiceDialog.dispose();
        invoiceDialog = null;
    }
 private void createInvoiceOK() {
        String date = invoiceDialog.getInvDateField().getText();
        String customer = invoiceDialog.getCustNameField().getText();
        int num = frame.getNextInvoiceNum();

        Header headers = new Header(num, date, customer);
        frame.getHeaders().add(headers);
        frame.getTableModel().fireTableDataChanged();
        invoiceDialog.setVisible(false);
        invoiceDialog.dispose();
        invoiceDialog = null;
    }
 
    private void saveButton() {
         ArrayList<Header> headers = frame.getHeaders();
        String heads = "";
        String lines = "";
        for (Header header : headers) {
            String invCSV = header.getAsCSV();
            heads += invCSV;
            heads += "\n";

            for (Item item : header.getItems()) {
                String lineCSV = item.getAsCSV();
               lines += lineCSV;
              lines += "\n";
            }
        }
        System.out.println("Check point");
        try {
            JFileChooser fc = new JFileChooser();
            int result = fc.showSaveDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File headFile = fc.getSelectedFile();
                FileWriter hfw = new FileWriter(headFile);
                hfw.write(heads);
                hfw.flush();
                hfw.close();
                result = fc.showSaveDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File itemFile = fc.getSelectedFile();
                    FileWriter lfw = new FileWriter(itemFile);
                    lfw.write(lines);
                    lfw.flush();
                    lfw.close();
                }
            }
        } catch (Exception ex) {

        }
     
    }

   private void createLineOK() {
        String obj = itemDialog.getItemNameField().getText();
        String countStr = itemDialog.getItemCountField().getText();
        String priceStr = itemDialog.getItemPriceField().getText();
        int count = Integer.parseInt(countStr);
        double price = Double.parseDouble(priceStr);
        int selectedHeader = frame.getItemTab().getSelectedRow();
        if (selectedHeader != -1) {
          Header header = frame.getHeaders().get(selectedHeader);
            Item items = new Item (obj , price, count , header);
            header.getItems().add(items);
           ItemTable itemTable = (ItemTable) frame.getItemTab().getModel();
         
            itemTable.fireTableDataChanged();
            frame.getTableModel().fireTableDataChanged();
        }
        itemDialog.setVisible(false);
        itemDialog.dispose();
        itemDialog = null;
    }
         private void createLineCancel() {
       itemDialog.setVisible(false);
       itemDialog.dispose();
       itemDialog = null;
    }
    }
