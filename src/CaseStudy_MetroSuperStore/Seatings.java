package CaseStudy_MetroSuperStore;

public class Seatings extends Furniture{
    private int loadCapacity;

    public Seatings(){

    }
    public Seatings(String name, double price, int stockQuantity, int uniqueIdentifier, double taxation, String material, String dimension, int loadCapacity) {
        super(name, price, stockQuantity, uniqueIdentifier, taxation, material, dimension);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Seatings{" + super.toString() +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
