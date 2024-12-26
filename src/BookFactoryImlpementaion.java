public class BookFactoryImlpementaion implements BookFactory {

    @Override
    public Book createBook(int id, String title, String author, int year, String genre) {
        return  new Book(id,title,author,year,genre);
    }
    
}
