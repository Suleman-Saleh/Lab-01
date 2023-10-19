package CaseStudy_MetroSuperStore;

public class Product {
    private String name;
    private double price;
    private int stockQuantity;
    private String uniqueIdentifier;
    private double taxation;

    public Product() {

    }

    public Product(String name, double price, int stockQuantity, String uniqueIdentifier, double taxation) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.uniqueIdentifier = uniqueIdentifier;
        this.taxation = taxation;
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

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public double getTaxation() {
        return taxation;
    }

    public void setTaxation(double taxation) {
        this.taxation = taxation;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", uniqueIdentifier='" + uniqueIdentifier + '\'' +
                ", taxation=" + taxation +
                '}';
    }
}
