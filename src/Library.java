import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    public static Library LibraryInstance;
    private List<Book> bookCollection = new ArrayList<>();

    private Library() { }

    public static Library getInstance() {
        if (LibraryInstance == null) {
            LibraryInstance = new Library();
        }
        return LibraryInstance;
    }

    public void addBook(int id, String title, String author, int year, String genre) throws DuplicateBookException {
        boolean flag = false;
        for (Book b : bookCollection) {
            if (b.getId() == id) {
                flag = true;
            }
        }
        if (flag) {
            throw new DuplicateBookException("Book with Id: " + id + " already Exists!!!");
        } else {
            BookFactory bookFactory = new BookFactoryImlpementaion();
            Book newBook = bookFactory.createBook(id, title, author, year, genre);
            LibraryInstance.bookCollection.add(newBook);
        }
    }

    public void removeBook(int bookId) throws BookNotFoundException {
        boolean flag = false;
        Book removedBook = new Book();
        for (Book b : bookCollection) {
            if (bookId == b.getId()) {
                flag = true;
                removedBook = b;
                bookCollection.remove(b);
                break;
            }
        }
        if (flag) {
            System.out.println(removedBook + " is removed from the Collection!!!");
        } else {
            throw new BookNotFoundException("No Book with id: " + bookId + " is found!!!");
        }
    }

    public void removeBook(String title) throws BookNotFoundException {
        boolean flag = false;
        Book removedBook = new Book();
        for (Book b : bookCollection) {
            if (title.equals(b.getTitle())) {
                flag = true;
                removedBook = b;
                bookCollection.remove(b);
                break;
            }
        }
        if (flag) {
            System.out.println(removedBook + " is removed from the Collection!!!");
        } else {
            throw new BookNotFoundException("No Book with title: " + title + " is found!!!");
        }
    }

    public void search(String author, String title, int year) throws BookNotFoundException {
        List<Book> result = bookCollection.stream()
            .filter(book -> title.length() == 0 || book.getTitle().equals(title))
            .filter(book -> author.length() == 0 || book.getAuthor().toLowerCase().contains(author.toLowerCase()))
            .filter(book -> year == 0 || book.getYear() == year)
            .collect(Collectors.toList());

        if (result.isEmpty()) {
            throw new BookNotFoundException("No Book found against desired criteria!!!");
        } else {
            for (Book b : result) {
                System.out.println(b);
            }
        }
    }

    public void display() {
        bookCollection.sort((a, b) -> (a.getYear() - b.getYear()));
        for (Book b : bookCollection) {
            System.out.println(b);
        }
    }
}
