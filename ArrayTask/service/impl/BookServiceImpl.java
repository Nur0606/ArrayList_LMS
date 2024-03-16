package ArrayTask.service.impl;

import ArrayTask.db.Database;
import ArrayTask.model.Book;
import ArrayTask.model.Library;
import ArrayTask.service.BookService;


import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public Book save(Long libraryId, Book book) {
        for (Library library : Database.getLibraries) {
            if (library.getId().equals(libraryId)) {
                library.getBooks().add(book);
                return book;
            } else
                System.out.println("Ne Naydeno!");
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        for (Library getLibrary : Database.getLibraries) {
            if (getLibrary.getId().equals(libraryId)) {
                return getLibrary.getBooks();
            } else
                System.out.println("Library Not-Found!");
        }
        return null;

    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (Library library : Database.getLibraries) {
            if (library.getId().equals(libraryId)) {
                for (Book getBook : library.getBooks()) {
                    if (getBook.getId().equals(bookId)) {
                        return getBook;
                    } else
                        System.out.println("Not-found!");
                }
            }
        }
        return null;
    }


    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (Library library : Database.getLibraries) {
            if (library.getId().equals(libraryId)) {
                for (Book book : library.getBooks()) {
                    if (book.getId().equals(bookId)) {
                       library.getBooks().remove(book);
                        return "✅";
                    } else
                        System.out.println("Ne Udaleno!");
                }
            }
        }
        return null;
    }

    @Override
    public void clearBookByLibrary(Long libraryId) {
        for (Library library : Database.getLibraries) {
            if (library.getId().equals(libraryId)) {
                library.getBooks().clear();
            }
        }
    }
}
