public class Book {

  private String bookName;
  private Author author;
  private int bookYear;
  public Book (String bookName, Author author, int bookYear){
    this.bookName = bookName;
    this.author = author;
    this.bookYear = bookYear;
  }
  public String getBookName(){
    return this.bookName;
  }
  public Author getAuthor(){
    return this.author;
  }
  public int getBookYear(){
    return this.bookYear;
  }
  public void setBookYear(int bookYear){
    this.bookYear = bookYear;
  }
}