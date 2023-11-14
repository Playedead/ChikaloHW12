import java.util.Objects;

public class Book {

  private String bookName;
  private String author;
  private int bookYear;

  public Book(String bookName, String author, int bookYear) {
    this.bookName = bookName;
    this.author = author;
    this.bookYear = bookYear;
  }

  public String getBookName() {
    return this.bookName;
  }

  public String getAuthor() {
    return this.author;
  }

  public int getBookYear() {
    return this.bookYear;
  }

  public void setBookYear(int bookYear) {
    this.bookYear = bookYear;
  }

  @Override
  public String toString() {
    return "Название книги: " + bookName + "; Автор: " + author + "; Год издания: " + bookYear
        + ";";
  }

  @Override
  public boolean equals(Object other) {
    if (other == null) {
      return false;
    }
    if (this == other) {
      return true;
    }
    if (other.getClass() != Book.class) {
      return false;
    }
    Book other1 = (Book) other;
    return Objects.equals(bookName, other1.bookName) && Objects.equals(author, other1.author)
        && bookYear == other1.bookYear;
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookName, author, bookYear);
  }
}


