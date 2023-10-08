package LabAssignment_1;

public class LibraryItem {
    private String title;
    private String author;
    private int year;
<<<<<<< HEAD
    private boolean isBorrowed;
    private LibraryItemType itemType;

    public LibraryItem(String title, String author, int year, LibraryItemType itemType) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.itemType = itemType;
        this.isBorrowed = false;
=======
    private boolean isborrowed;
    private LibraryItemType itemtype;

    public LibraryItem(){

    }

    public LibraryItem(String title, String author, int year, boolean isborrowed,LibraryItemType itemtype) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isborrowed = isborrowed;
        this.itemtype = itemtype;
>>>>>>> origin/master
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
<<<<<<< HEAD
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public LibraryItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                "\nAuthor: " + author +
                "\nYear: " + year +
                "\nItem Type: " + itemType +
                "\nIs Borrowed: " + isBorrowed;
=======
        return isborrowed;
    }

    public void setIsborrowed(boolean isborrowed) {
        this.isborrowed = isborrowed;
    }

    public LibraryItemType getItemtype() {
        return itemtype;
    }

    public void setItemtype(LibraryItemType itemtype) {
        this.itemtype = itemtype;
    }
    public boolean equals(LibraryItem item){
        //LibraryItem items = (LibraryItem) o;
        if(item.getAuthor().equals(this.getAuthor()) && item.getTitle().equals(this.getTitle())){
            return true;
        }
        else{
            return false;
        }
>>>>>>> origin/master
    }
}
