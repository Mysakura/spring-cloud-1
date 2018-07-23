package com.cloud.bookserviceprovider.service.impl;

import com.cloud.bookserviceprovider.dao.BookDAO;
import com.cloud.bookserviceprovider.service.BookService;
import com.cloud.common.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: cloud-master
 * @description:
 * @author: 001977
 * @create: 2018-07-20 16:59
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    public int addBook(Book book) {
        return bookDAO.addBook(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookDAO.getBookById(id);
    }

    @Override
    public List<Book> getBooks() {
        return bookDAO.getBooks();
    }
}
