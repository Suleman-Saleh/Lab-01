package CaseStudy_MetroSuperStore;
import java.util.InputMismatchException;
import java.util.Scanner;
 public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            InventorySystem inventorySystem = new InventorySystem(); // Initialize the InventorySystem

            // Create instances of products (Laptops, Smartphones, etc.)
            Laptops l = new Laptops("HP",100000.0,10,13579,1.5,"1500MW",4.5,"i7", 10,"15.6 inches");
            Smartphones p = new Smartphones("Iphone", 1003, 202, 303, 4.4, "450 watts", 5.0, "soft", 4, 5);
            AudioDevices a = new AudioDevices("Audionic", 1004, 203, 304, 5.5, "500 watts",2 );
            Seatings s = new Seatings("Chair", 1000, 20, 305, 2.5,"Material", "4",100);
            Tables t = new Tables("Dinning", 1006, 205, 306, 7.7,"glass", "4", "round");
            Groceries g1=new Groceries("Milk",120,20,23,1.2,new Date(1,12,2023),"Proteins,Fats");

            // Add products to the inventory
            inventorySystem.addProduct(l);
            inventorySystem.addProduct(p);
            inventorySystem.addProduct(a);
            inventorySystem.addProduct(s);
            inventorySystem.addProduct(t);
            inventorySystem.addProduct(g1);

            int choice;
            do {
                System.out.println("Select from Menu:");
                System.out.println("Enter 1 for search");
                System.out.println("Enter 2 for update");
                System.out.println("Enter 3 for generate product details");
                System.out.println("Enter 4 for add product");
                System.out.println("Enter 5 to remove product by unique id");
                System.out.println("Enter 6 to display all available products");
                System.out.println("-1 to exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter the uniqueIdentifier to search: ");
                            int id = sc.nextInt();
                            inventorySystem.searchProduct(id);
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a valid integer for uniqueIdentifier.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter uniqueIdentifier to update: ");
                        int updateId = sc.nextInt();
                        System.out.print("Enter new price or stock quantity: ");
                        double newValue = sc.nextDouble();
                        inventorySystem.updatePrice(updateId, newValue);
                        break;
                    case 3:
                        System.out.print("Enter uniqueIdentifier to generate product details: ");
                        int generateId = sc.nextInt();
                        inventorySystem.generateProductDetails(generateId);
                        break;
                    case 4:
                        System.out.println("Enter 1 to add Laptops");
                        System.out.println("Enter 2 to add Smartphones");
                        System.out.println("Enter 3 to add AudioDevice");
                        System.out.println("Enter 4 to add Seats");
                        System.out.println("Enter 5 to add Tables");
                        System.out.println("Enter 6 to add Groceries");

                        int option = sc.nextInt();

                        System.out.println("Enter product details:");

                        System.out.print("Enter product name: ");
                        String name = sc.next();

                        System.out.print("Enter unique identifier: ");
                        int uniqueIdentifier = sc.nextInt();

                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();

                        System.out.print("Enter stock quantity: ");
                        int stockQuantity = sc.nextInt();

                        System.out.print("Enter taxation: ");
                        double taxation = sc.nextDouble();

                        switch (option) {
                            case 1:
                                System.out.print("Enter power consumption: ");
                                String laptopPowerConsumption = sc.next();

                                System.out.print("Enter warranty: ");
                                double laptopWarranty = sc.nextDouble();

                                System.out.print("Enter processor type: ");
                                String processorType = sc.next();

                                System.out.print("Enter RAM size (GB): ");
                                int RAM_size = sc.nextInt();

                                System.out.print("Enter screen dimensions: ");
                                String screenDimensions = sc.next();

                                Laptops newLaptop = new Laptops(name, price, stockQuantity, uniqueIdentifier, taxation, laptopPowerConsumption, laptopWarranty, processorType, RAM_size, screenDimensions);
                                inventorySystem.addProduct(newLaptop);
                                break;

                            case 2:
                                System.out.print("Enter power consumption: ");
                                String smartphonePowerConsumption = sc.next();

                                System.out.print("Enter warranty: ");
                                double smartphoneWarranty = sc.nextDouble();

                                System.out.print("Enter operating system: ");
                                String operatingSystem = sc.next();

                                System.out.print("Enter storage (GB): ");
                                int storage = sc.nextInt();

                                System.out.print("Enter camera resolution (MP): ");
                                int cameraResolution = sc.nextInt();

                                Smartphones newSmartphone = new Smartphones(name, price, stockQuantity, uniqueIdentifier, taxation, smartphonePowerConsumption, smartphoneWarranty, operatingSystem, storage, cameraResolution);
                                inventorySystem.addProduct(newSmartphone);
                                break;

                            case 3:
                                System.out.print("Enter power consumption: ");
                                String audioPowerConsumption = sc.next();

                                System.out.print("Enter warranty: ");
                                double audioWarranty = sc.nextDouble();

                                AudioDevices newAudioDevice = new AudioDevices(name, price, stockQuantity, uniqueIdentifier, taxation, audioPowerConsumption, audioWarranty);
                                inventorySystem.addProduct(newAudioDevice);
                                break;

                            case 4:
                                System.out.print("Enter material: ");
                                String material = sc.next();

                                System.out.print("Enter dimension: ");
                                String dimension = sc.next();

                                System.out.print("Enter load capacity: ");
                                int loadCapacity = sc.nextInt();

                                Seatings newSeating = new Seatings(name, price, stockQuantity, uniqueIdentifier, taxation, material, dimension, loadCapacity);
                                inventorySystem.addProduct(newSeating);
                                break;

                            case 5:
                                System.out.print("Enter material: ");
                                String tableMaterial = sc.next();

                                System.out.print("Enter dimension: ");
                                String tableDimension = sc.next();

                                System.out.print("Enter shape: ");
                                String tableShape = sc.next();

                                Tables newTable = new Tables(name, price, stockQuantity, uniqueIdentifier, taxation, tableMaterial, tableDimension, tableShape);
                                inventorySystem.addProduct(newTable);
                                break;

                            case 6:
                                System.out.print("Enter expiration date (dd mm yyyy): ");
                                int day = sc.nextInt();
                                int month = sc.nextInt();
                                int year = sc.nextInt();

                                System.out.print("Enter nutrition information: ");
                                String nutrition = sc.next();

                                Groceries newGrocery = new Groceries(name, price, stockQuantity, uniqueIdentifier, taxation, new Date(day, month, year), nutrition);
                                inventorySystem.addProduct(newGrocery);
                                break;
                            default:
                                System.out.println("Invalid option. Please select a valid product type.");
                        }
                    case 5:
                        System.out.print("Enter the uniqueIdentifier of the product to remove: ");
                        int removeId = sc.nextInt();
                        inventorySystem.removeProduct(removeId);
                        System.out.println("Product with uniqueIdentifier " +removeId+ "removed");
                        break;
                    case 6:
                        System.out.println("Display Available products");
                        inventorySystem.displayAvailableProducts();
                        break;
                    default:
                        System.out.println("Invalid option. Please select a valid product type.");
                        break;
                }


            } while (choice != -1);
        }
    }

