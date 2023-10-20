package CaseStudy_MetroSuperStore;

public class Furniture extends Product{
    private String material;
    private String dimension;

    public Furniture(){

    }

    public Furniture(String name, double price, int stockQuantity, int uniqueIdentifier, double taxation, String material, String dimension) {
        super(name, price, stockQuantity, uniqueIdentifier, taxation);
        this.material = material;
        this.dimension = dimension;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Furniture{" + super.toString() +
                "material='" + material + '\'' +
                ", dimension='" + dimension + '\'' +
                '}';
    }
}
