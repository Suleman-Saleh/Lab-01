package ComputerLabInventorySystem;

public class Computer {
    private String computer_no;
    private String lcd_model;
    private int ram_size;
    private int hdd_size;
    private boolean hasGPU;

    public Computer(){

    }
    public Computer(String computer_no, String lcd_model, int ram_size, int hdd_size, boolean hasGPU) {
        this.computer_no = computer_no;
        this.lcd_model = lcd_model;
        this.ram_size = ram_size;
        this.hdd_size = hdd_size;
        this.hasGPU = hasGPU;
    }

    public String getComputer_no() {
        return computer_no;
    }

    public void setComputer_no(String computer_no) {
        this.computer_no = computer_no;
    }

    public String getLcd_model() {
        return lcd_model;
    }

    public void setLcd_model(String lcd_model) {
        this.lcd_model = lcd_model;
    }

    public int getRam_size() {
        return ram_size;
    }

    public void setRam_size(int ram_size) {
        this.ram_size = ram_size;
    }

    public int getHdd_size() {
        return hdd_size;
    }

    public void setHdd_size(int hdd_size) {
        this.hdd_size = hdd_size;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    @Override
    public boolean equals(Object o) {
        Computer cm = (Computer) o;
        if(cm.getComputer_no().equals(this.computer_no)){
            return true;
        }
        else {
            return false;
        }
    }
    public Computer clone() {
        return new Computer(this.computer_no, this.lcd_model, this.ram_size, this.hdd_size, this.hasGPU);
    }
    public String toString() {
        return "Computer no: " + computer_no+
                "\nlcd model: " + lcd_model + "\nRAM size: " + ram_size + "\nHDD size: " + hdd_size +
                "\nhas GPU: " + hasGPU;
    }
}
