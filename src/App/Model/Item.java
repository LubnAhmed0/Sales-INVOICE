
package App.Model;

public class Item {
   private Header header;
    private String obj;
    private int count;
    private double price;

    public Item (){
    }
    
    public Item(Header header, String obj, int count, double price) {
        this.header = header;
        this.obj = obj;
        this.count = count;
        this.price = price;
    }

    public Item(String obj, double price, int count, Header header) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     public double getItemTotal(){
        return price * count ;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Item{" + "obj=" + obj + ", count=" + count + ", price=" + price +"num "+ header.getNum()+'}';
    }

    public Header getHeader() {
        return header;
    }

 public String getAsCSV() {
        return header.getNum() + "," +obj + "," + price + "," + count;
    }
}