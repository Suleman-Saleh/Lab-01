package LabAssignment_1;

public class Library {
    private LibraryItem[] libraryItems = new LibraryItem[100];
    private int itemCount = 0;

    public void addItem(LibraryItem item) {
        libraryItems[itemCount++] = item;
    }

    public void borrowItem(LibraryItem item) {
        item.setBorrowed(true);
    }

    public void returnItem(LibraryItem item) {
        item.setBorrowed(false);
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");
        for (int i = 0; i < itemCount; i++) {
            if (!libraryItems[i].isBorrowed()) {
                System.out.println(libraryItems[i]);
            }
        }
    }

    public void displayBorrowedItems() {
        System.out.println("Borrowed Items:");
        for (int i = 0; i < itemCount; i++) {
            if (libraryItems[i].isBorrowed()) {
                System.out.println(libraryItems[i]);
            }
        }
    }
}
