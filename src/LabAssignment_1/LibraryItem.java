package LabAssignment_1;

public class LibraryItem {
    private String title;
    private String author;
    private int year;
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
    }
}
