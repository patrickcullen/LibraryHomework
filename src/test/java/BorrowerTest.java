import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BorrowerTest {

    Borrower borrower;
    Bookn bookn;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Malcolm");
        bookn = new Bookn("I am the Greatest", "Sport");
        library = new Library(5);
        library.addBook(bookn);
        library.addBook(bookn);
        library.addBook(bookn);
    }

    @Test
    public void canBorrowBook() {
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(2, library.bookCount());
    }

}
