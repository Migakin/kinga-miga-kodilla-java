package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() throws CloneNotSupportedException {

        //Given
        Book book1 = new Book("Book of questions", "Edmound Jabes", LocalDate.of(1983, 05, 23));
        Book book2 = new Book("In Search of Lost Time", "Marcel Proust", LocalDate.of(1919, 8, 15));
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupéry", LocalDate.of(1943, 11, 9 ));

        Library library = new Library("library number 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //shallow copy of Library


        Library clonedLibrary = library.shallowCopy();
        clonedLibrary.setName("library number 2");


        //deep copy of Library

        Library deepClonedLibrary = library.deepCopy();
        deepClonedLibrary.setName("library number 3");

        //when

        //then
        Assert.assertEquals(deepClonedLibrary.getBooks(), clonedLibrary.getBooks());
    }

}
