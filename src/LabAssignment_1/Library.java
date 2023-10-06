package LabAssignment_1;
public class Library {
    LibraryItem[] libraryItems = new LibraryItem[100];
    private int itemcount = 0;


    public void addItem(LibraryItem add1){
        libraryItems[itemcount++] = add1;
    }

    public void borrowItem(LibraryItem item){

        item.setIsborrowed(true);
    }

    public void returnItem(LibraryItem item){
        item.setIsborrowed(false);
    }

    public void displayBorrowedItems(){
        for(int i=0;i<itemcount;i++){
            if(libraryItems[i].isBorrowed()){
                System.out.println(libraryItems[i]);
            }

        }
    }

    public void displayAvailableItems(){
        for(int i=0;i<itemcount;i++){
            if(!libraryItems[i].isBorrowed()){
                System.out.println(libraryItems[i]);
            }

        }
    }

}