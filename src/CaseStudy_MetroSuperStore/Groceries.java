package CaseStudy_MetroSuperStore;

public class Groceries extends Product{
    Date expDate;
    String nutrition;

    public Groceries(){

    }

    public Groceries(String name, double price, int stockQuantity, String uniqueIdentifier, double taxation, Date expDate, String nutrition) {
        super(name, price, stockQuantity, uniqueIdentifier, taxation);
        this.expDate = expDate;
        this.nutrition = nutrition;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return "Groceries{" + super.toString() +
                "expDate=" + expDate +
                ", nutrition='" + nutrition + '\'' +
                '}';
    }
}
