package com.service.impl;

import com.bean.Book;
import com.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    public void hello() {
        List<Book> list = bookService.list();
        for (Book book : list) {
            System.out.println(book);
        }
    }
}