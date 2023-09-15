public class Book {
    private String author;
    private String book_name;

    public void setAuthor(String author1){
        author = author1;
    }
    public  String getAuthor() {
        return author;
    }

    public void setBook_name(String book1){
        book_name = book1;
    }
    public String getBook_name(){
        return book_name;
    }

    public  void printinfo(){
        System.out.println("Author:" + author);
        System.out.println("Book Name:" + book_name);
    }
}
