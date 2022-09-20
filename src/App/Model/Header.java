
package App.Model;

import java.util.ArrayList;
import java.util.Date;

public class Header {
    private int num;
    private String name ;
    private Date date ;
    private ArrayList<Item> items ;
    
    public Header(){
        
    }
    public Header(int num, String name, Date date) {
        this.num = num;
        this.name = name;
        this.date = date;
    }
    public double getHeaderTotal(){
        double total = 0.0;
        for( Item item : getItems()){
            total += item.getItemTotal();
        }
        return total;
    }
    public ArrayList<Item> getItems() {
        if (items ==null){
            items = new ArrayList<>();
        }
        return items;
    }

    public String getName() {
        return name;
    }
 public void setName(String name) {
        this.name = name;
    }
       public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
 public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Header(int num, String date, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Header{" + "num=" + num + ", name=" + name + ", date=" + date + ", item=" + items + '}';
    }
   public String getAsCSV(){
       return num + ","+ date +","+ name ;
   }

    
}
