public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter = 1;

    private Date mfgdate;



    Product(String name, double price, int quantity, Date mfgdate) {

        this.id = counter++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.mfgdate = mfgdate;
    }

    public Date getMfgdate() {
        return mfgdate;
    }

    public void setMfgdate(Date mfgdate) {
        this.mfgdate = mfgdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

////    public String getMfgdate() {
////        return mfgdate;
////    }
//
//    public void setMfgdate(String mfgdate) {
//        this.mfgdate = mfgdate;
//    }

    public String toString() {
        String productDetails = String.format("ID:%02d\nName:%s\nPrice:%,.1f\nQuantity:%d\nMfc date:%s\n", id, name, price, quantity,mfgdate);
        return productDetails;

    }
    public Product recentdate(Product p1,Product p2){
         Date temp = mfgdate.isrecentdate(p1.mfgdate,p2.mfgdate);
         return temp == p1.mfgdate?p1:p2;
    }




}


