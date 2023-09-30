package ComputerLabInventorySystem;

public class University {
    private Lab[] labs; // Array of Lab objects

    // Default constructor
    public University() {
        labs = new Lab[100]; // Initialize the array with a fixed size (e.g., 100 labs)
    }

    // Method to add a lab to the university
    public void addLab(Lab lab) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] == null) {
                labs[i] = lab;
                break; // Exit the loop after adding the lab
            }
        }
    }

    // Method to remove a lab from the university
    public void removeLab(Lab lab) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] != null && labs[i].equals(lab)) {
                labs[i] = null;
                break; // Exit the loop after removing the lab
            }
        }
    }

    // Method to fetch a lab by its index
    public Lab getLab(int index) {
        if (index >= 0 && index < labs.length) {
            return labs[index];
        } else {
            return null; // Invalid index, return null or handle the error as needed
        }
    }

    // Method to fetch the number of labs in the university
    public int getLabCount() {
        int count = 0;
        for (Lab lab : labs) {
            if (lab != null) {
                count++;
            }
        }
        return count;
    }

    // Method to fetch details about a specific lab by its index
    public String getLabDetails(int index) {
        Lab lab = getLab(index);
        if (lab != null) {
            return "Lab ID: " + lab.getLabID() +
                    "\nLab Status: " + lab.getStatus() +
                    "\nLab Attendant: " + lab.getLabAttendent().getName();
            // You can add more details as needed
        } else {
            return "Lab not found"; // Handle the case when the lab is not found
        }
    }

    // Method to fetch details about a specific computer in a specific lab
    public String getComputerDetails(int labIndex, int computerIndex) {
        Lab lab = getLab(labIndex);
        if (lab != null) {
            Computer computer = lab.getComputer(computerIndex);
            if (computer != null) {
                return "Computer Number: " + computer.getComputer_no() +
                        "\nLCD Model: " + computer.getLcd_model() +
                        "\nRAM Size: " + computer.getRam_size() +
                        "\nHDD Size: " + computer.getHdd_size() +
                        "\nHas GPU: " + computer.isHasGPU();
                // You can add more details as needed
            } else {
                return "Computer not found in the specified lab";
            }
        } else {
            return "Lab not found"; // Handle the case when the lab is not found
        }
    }
}
