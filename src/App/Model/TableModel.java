
package App.Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {
    private ArrayList <Header> headers;
    private String[] columns = { " number", "date","name","total"};
    
    public TableModel(ArrayList<Header> headers) {
        this.headers = headers;
    }

    @Override
    public int getRowCount() {
       return headers.size(); 
       
    }

    @Override
    public int getColumnCount() {
        
        return columns.length;
        
    }
    @Override
   public String getColumnName(int column) {
   
       return columns[column];
   }
   
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Header header = headers.get(rowIndex);
     
      switch (columnIndex){
          case 0 : return header.getNum();
          case 1 : return header.getDate();
          case 2 : return header.getName();
          case 3 : return header.getHeaderTotal();
          default : return "";
      }
    }

    public int getSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}       
    


