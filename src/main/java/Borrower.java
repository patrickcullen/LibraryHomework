import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Bookn> bookshelf;

    public Borrower(String name) {
        this.name = name;
        this.bookshelf = new ArrayList<>();
    }

    public int bookCount() {
        return this.bookshelf.size();
    }

    public void borrowBookFromLibrary(Library library) {
        Bookn books = library.lendBook();
        this.bookshelf.add(books);
    }
}
