package ComputerLabInventorySystem;

public class Employee {
    private String employeeID;
    private String name;

    public static String designation = "Lab Attendent";

    public Employee(){

    }
    public Employee(String employeeID,String name){
        this.employeeID = employeeID;
        this.name = name;
    }
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    public String getEmployeeID() {
        return employeeID;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public static void setDesignation(String designation) {
        Employee.designation = designation;
    }

    public static String getDesignation() {
        return designation;
    }
}
