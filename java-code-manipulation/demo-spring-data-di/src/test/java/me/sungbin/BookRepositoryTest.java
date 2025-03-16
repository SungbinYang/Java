package me.sungbin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    void di() {
        assertNotNull(bookRepository);

        Book book = new Book();
        book.setTitle("spring");
        bookRepository.save(book);

        bookRepository.findAll();
    }
}