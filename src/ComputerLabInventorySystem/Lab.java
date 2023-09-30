package ComputerLabInventorySystem;

public class Lab {
    private String labID;
    private Computer[] computers;
    private LabStatus status;
    private Employee labAttendent;

    public Lab(){

    }
    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendent){
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendent = labAttendent;
    }

    public String getLabID() {
        return labID;
    }

    public void setLabID(String labID) {
        this.labID = labID;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public Employee getLabAttendent() {
        return labAttendent;
    }

    public void setLabAttendent(Employee labAttendent) {
        this.labAttendent = labAttendent;
    }

    public void addComputer(Computer computer){
        for(int i = 0; i < computers.length; i++){
            if(computers[i] == null){
                computers[i] = computer;
            }
        }
    }
    public void removeComputer(Computer computer){
        for(int i = 0; i < computers.length; i++){
            if(computers[i] != null && computers[i].equals(computer)){
                computers[i] = null;
            }
        }
    }
    public Computer getComputer(int index) {
        if (index >= 0 && index < computers.length) {
            return computers[index];
        } else {
            return null; // Invalid index, return null or handle the error as needed
        }
    }
}
