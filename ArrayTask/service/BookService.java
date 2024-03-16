package ArrayTask.service;

import ArrayTask.model.Book;

import java.util.List;

public interface BookService {
    Book save (Long libraryId, Book book);
    List<Book> getAllBooks(Long libraryId);
    Book getBookById(Long libraryId, Long bookId);
    String  deleteBook(Long libraryId , Long bookId);
    void clearBookByLibrary(Long libraryId);
}
