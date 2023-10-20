package CaseStudy_MetroSuperStore;

public class Tables extends Furniture{
    String shape;

    public Tables(){

    }

    public Tables(String name, double price, int stockQuantity, int uniqueIdentifier, double taxation, String material, String dimension, String shape) {
        super(name, price, stockQuantity, uniqueIdentifier, taxation, material, dimension);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Tables{" + super.toString() +
                "shape='" + shape + '\'' +
                '}';
    }
}
