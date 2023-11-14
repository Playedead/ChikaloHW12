public class Main {

  public static void main(String[] args) {
    Book bookOne = new Book("Tanatonauts", "Bernard Verber", 1994);
    Book bookTwo = new Book("Solaris", "Stanislaw Lem", 1961);
    System.out.println(bookOne);
    System.out.println(bookTwo);
    System.out.println(bookOne.equals(bookTwo));
  }
}