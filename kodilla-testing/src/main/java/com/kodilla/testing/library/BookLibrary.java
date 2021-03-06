package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }


    /* public List<Book> listBooksInHandOf (LibraryUser libraryUser){
        List<Book> userBooks = new ArrayList<Book>();
        Book book = new Book("Title", "Author", 2006);
        LibraryUser user = new LibraryUser("Karol", "Iksinski", "89061255202");

       if (libraryDatabase.rentABook(user,book)){
           userBooks.add(book);
       }*/

}
