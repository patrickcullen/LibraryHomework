
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Bookn> books;
    private HashMap<String, Bookn> booksByGenre;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.booksByGenre = new HashMap();
        this.capacity = capacity;
    }

    public int bookCount(){
        return this.books.size();
    }

    public void addBook(Bookn bookn) {
        if (bookCount() < this.capacity) {
            this.books.add(bookn);
        }
    }

    public int getCapacity(){
        return this.capacity;
    }

    public Bookn lendBook() {
        return this.books.remove(0);
    }


}
