package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuit {

    @Test
    public void testGetBook() {
        //Given
        Book book1 = new Book("Book1", "Author1", LocalDate.of(2000,01,01));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2001,02,05));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(2002,03,06));
        Book book4 = new Book("Book4", "Author4", LocalDate.of(2003,04,07));

        Library library = new Library("Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library Copy 1");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library Copy 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepCloneLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, cloneLibrary.getBooks().size());
        Assert.assertEquals(4, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), cloneLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepCloneLibrary.getBooks());


    }


}
