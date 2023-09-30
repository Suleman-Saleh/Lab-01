package ComputerLabInventorySystem;

public class Demo {
        public static void main(String[] args) {
            // Create some computers
            Computer computer1 = new Computer("C001", "LCD-1", 8, 512, true);
            Computer computer2 = new Computer("C002", "LCD-2", 16, 1024, false);

            System.out.println(computer1);
            // Create some employees
            Employee attendant1 = new Employee("E001", "John Doe");
            Employee attendant2 = new Employee("E002", "Jane Smith");

            // Create some labs
            Lab lab1 = new Lab("L001", new Computer[10], LabStatus.OPEATIONAL, attendant1);
            Lab lab2 = new Lab("L002", new Computer[15], LabStatus.FAULTY_MULTIMEDIA, attendant2);

            // Create a university
            University university = new University();

            // Add labs to the university
            university.addLab(lab1);
            university.addLab(lab2);

            // Add computers to labs
            lab1.addComputer(computer1);
            lab2.addComputer(computer2);

            // Fetch and print details
            System.out.println("University Lab Count: " + university.getLabCount());
            System.out.println("Lab 1 Details:\n" + university.getLabDetails(0));
            System.out.println("Lab 2 Details:\n" + university.getLabDetails(1));
            System.out.println("Computer 1 Details:\n" + university.getComputerDetails(0, 0));
            System.out.println("Computer 2 Details:\n" + university.getComputerDetails(1, 0));
        }

    }


