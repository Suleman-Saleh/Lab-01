package CaseStudy_MetroSuperStore;

public class Electronics extends Product{
    private String powerConsumption;
    private double warranty;

    public Electronics(){

    }

    public Electronics(String name, double price, int stockQuantity, int uniqueIdentifier, double taxation, String powerConsumption, double warranty) {
        super(name, price, stockQuantity, uniqueIdentifier, taxation);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWarranty() {
        return warranty;
    }

    public void setWarranty(double warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" + super.toString() +
                "powerConsumption='" + powerConsumption + '\'' +
                ", warranty=" + warranty +
                '}';
    }
}
