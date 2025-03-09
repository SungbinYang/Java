package me.sungbin.demospringdi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BookServiceTest {

    @Autowired
    BookService bookService;

    @Test
    void di() {
        assertNotNull(bookService);
        assertNotNull(bookService.bookRepository);
    }
}