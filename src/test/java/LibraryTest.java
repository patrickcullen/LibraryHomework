import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Bookn bookn;

    @Before
    public void before(){
        library = new Library(5);
        bookn = new Bookn("Evil Dead", "Horror");
    }

    @Test
    public void getBookCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void getCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void canAddBook() {
        library.addBook(bookn);
        library.addBook(bookn);
        library.addBook(bookn);
        library.addBook(bookn);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void camAddBook__overcapacity() {
        library.addBook(bookn);
        library.addBook(bookn);
        library.addBook(bookn);
        library.addBook(bookn);
        library.addBook(bookn);
        library.addBook(bookn);
        assertEquals(5, library.bookCount());
    }


}
