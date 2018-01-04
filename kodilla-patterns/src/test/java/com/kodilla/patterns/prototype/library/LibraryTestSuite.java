package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Book of questions", "Edmound Jabes", LocalDate.of(1983, 05, 23));
        Book book2 = new Book("In Search of Lost Time", "Marcel Proust", LocalDate.of(1919, 8, 15));
        Book book3 = new Book("The Little Prince", "Antoine de Saint-Exupéry", LocalDate.of(1943, 11, 9 ));

        Library library = new Library("library number 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //shallow copy of Library

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("library number 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //deep copy of Library

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("library number 3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book1);

        //then
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());


    }

}
