package behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Iterator<Book> iterator = library.createIterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println("Book name : "+book.getTitle());
        }
    }
}
