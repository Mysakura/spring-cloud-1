package com.cloud.bookserviceprovider.service;

import com.cloud.common.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: cloud-master
 * @description:
 * @author: 001977
 * @create: 2018-07-20 16:59
 */
public interface BookService {

    int addBook(Book book);

    Book getBookById(@Param("id") Long id);

    List<Book> getBooks();
}
