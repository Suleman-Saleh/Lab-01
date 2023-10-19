package CaseStudy_MetroSuperStore;

public class Smartphones extends Electronics{
    private String operatingSystem;
	private int storage;
	private int cameraResolution;

    public Smartphones(){

    }

    public Smartphones(String name, double price, int stockQuantity, String uniqueIdentifier, double taxation, String powerConsumption, double warranty, String operatingSystem, int storage, int cameraResolution) {
        super(name, price, stockQuantity, uniqueIdentifier, taxation, powerConsumption, warranty);
        this.operatingSystem = operatingSystem;
        this.storage = storage;
        this.cameraResolution = cameraResolution;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "Smartphones{" + super.toString() +
                "operatingSystem='" + operatingSystem + '\'' +
                ", storage=" + storage +
                ", cameraResolution=" + cameraResolution +
                '}';
    }

}
