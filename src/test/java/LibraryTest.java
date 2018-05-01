import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Bookn bookn;
    Bookn booka;
    Bookn bookb;
    Bookn bookc;
    Bookn bookd;
    Bookn booke;

    @Before
    public void before(){
        library = new Library(6);
        bookn = new Bookn("Evil Dead", "Horror");
        booka = new Bookn("The Devil Rides", "Horror");
        bookb = new Bookn("Shane", "Western");
        bookc = new Bookn("Creeping Vines", "Gardening");
        bookd = new Bookn("Rangers and Celtic", "Sport");
        booke = new Bookn("Dawn of Evil", "Horror");

    }

    @Test
    public void getBookCount() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void getCapacity(){
        assertEquals(6, library.getCapacity());
    }

    @Test
    public void canAddBook() {
        library.addBook(bookn);
        library.addBook(booka);
        library.addBook(bookb);
        library.addBook(bookc);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(6, library.getCapacity());
    }

    @Test
    public void canAddBook__overcapacity() {
        library.addBook(bookn);
        library.addBook(booka);
        library.addBook(bookb);
        library.addBook(bookc);
        library.addBook(bookd);
        library.addBook(booke);
        library.addBook(booke);
        library.addBook(booke);
        assertEquals(6, library.bookCount());
    }

}
