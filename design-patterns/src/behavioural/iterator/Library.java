package behavioural.iterator;

public class Library implements Aggregator{
    private Book[] books = new Book[5];

    public Library() {
        books[0] = new Book("JAVA");
        books[1] = new Book("DS");
        books[2] = new Book("OS");
        books[3] = new Book(".NET");
        books[4] = new Book("JS");
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
