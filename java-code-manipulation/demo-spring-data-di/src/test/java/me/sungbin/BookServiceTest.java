package me.sungbin;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {


    @Test
    void di() {
        BookRepository bookRepository = mock(BookRepository.class);
        Book hibernateBook = new Book();
        hibernateBook.setTitle("hibernate");
        when(bookRepository.save(any())).thenReturn(hibernateBook);
        BookService bookService = new BookService(bookRepository);

        Book book = new Book();
        book.setTitle("spring");
        bookService.rent(book);
        bookService.returnBook(book);
    }

}