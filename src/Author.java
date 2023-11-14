import java.util.Objects;

public class Author {

  private String name;
  private String surname;

  public Author(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public String getAuthorName() {
    return name;
  }

  public String getAuthorSurname() {
    return surname;
  }

  @Override
  public String toString() {
    return name + surname;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    if (other == null || getClass() != other.getClass()) {
      return false;
    }
    Author author = (Author) other;
    return Objects.equals(name, author.name) && Objects.equals(surname,
        author.surname);
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, surname);
  }
}


