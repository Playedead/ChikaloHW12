public class Main {

  public static void main(String[] args) {
    Author verber = new Author("Bernard", "Verber");
    Author lem = new Author("Stanislaw","Lem");
    Book tanatonauts = new Book("Tanatonauts", verber, 1994);
    Book solaris = new Book("Solaris", lem, 1961);
    System.out.println("Книга - " +tanatonauts.getBookName());
    System.out.println("Автор - " +tanatonauts.getBookAuthor());
    System.out.println("Год публикации - " +tanatonauts.getBookYear());
    System.out.println();
    System.out.println("Книга - " +solaris.getBookName());
    System.out.println("Автор - " +solaris.getBookAuthor());
    System.out.println("Год публикации - " +solaris.getBookYear());
    solaris.setBookYear(1962);
    System.out.println("Год публикации - " +solaris.getBookYear());
  }
}