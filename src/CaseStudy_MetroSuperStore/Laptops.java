package CaseStudy_MetroSuperStore;

public class Laptops extends Electronics{
    private String processorType;
	private int RAM_size;
	private String screenDimensions;

    public Laptops(String name, String uniqueIdentifier, double price, int stockQuantity, double taxation, String powerConsumption, Date date, String processorType, int ramSize, int i){

    }

    public Laptops(String name, double price, int stockQuantity, int uniqueIdentifier, double taxation, String powerConsumption, double warranty, String processorType, int RAM_size, String screenDimensions) {
        super(name, price, stockQuantity, uniqueIdentifier, taxation, powerConsumption, warranty);
        this.processorType = processorType;
        this.RAM_size = RAM_size;
        this.screenDimensions = screenDimensions;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getRAM_size() {
        return RAM_size;
    }

    public void setRAM_size(int RAM_size) {
        this.RAM_size = RAM_size;
    }

    public String getScreenDimensions() {
        return screenDimensions;
    }

    public void setScreenDimensions(String screenDimensions) {
        this.screenDimensions = screenDimensions;
    }

    @Override
    public String toString() {
        return "Laptops{" + super.toString() +
                "processorType='" + processorType + '\'' +
                ", RAM_size=" + RAM_size +
                ", screenDimensions='" + screenDimensions + '\'' +
                '}';
    }
}
