import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Library library = Library.getInstance();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book (Skip any parameter that is optional)");
            System.out.println("3. Remove Book using BookId");
            System.out.println("4. Remove Book using Title");
            System.out.println("5. List All Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                System.out.print("Enter Book ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Enter Book Title: ");
                String title = scanner.nextLine();
                
                System.out.print("Enter Book Author: ");
                String author = scanner.nextLine();
                
                System.out.print("Enter Book Genre: ");
                String genre = scanner.nextLine();
                
                System.out.print("Enter Book Publication-Year: ");
                int year = scanner.nextInt();
                scanner.nextLine();
                
                try {
                    library.addBook(id, title, author, year, genre);
                    System.out.println("Book added successfully!");
                } catch (DuplicateBookException e) {
                    System.out.println(e);
                }
            } else if (input == 2) {
                System.out.println("Enter Publication Year (Enter 0 to skip): ");
                int year = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Enter Author Name: ");
                String author = scanner.nextLine();
                
                System.out.println("Enter Title: ");
                String title = scanner.nextLine();
                
                try {
                    library.search(author, title, year);
                } catch (BookNotFoundException e) {
                    System.out.println(e);
                }
            } else if (input == 3) {
                System.out.println("Enter BookId: ");
                int bookId = scanner.nextInt();
                scanner.nextLine();
                
                try {
                    library.removeBook(bookId);
                } catch (BookNotFoundException e) {
                    System.out.println(e);
                }
            } else if (input == 4) {
                System.out.println("Enter Title: ");
                String title = scanner.nextLine();
                
                try {
                    library.removeBook(title);
                } catch (BookNotFoundException e) {
                    System.out.println(e);
                }
            } else if (input == 5) {
                library.display();
            } else {
                break;
            }
        }
    }
}
