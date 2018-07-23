package com.cloud.bookserviceprovider.dao;

import com.cloud.common.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: cloud-master
 * @description:
 * @author: 001977
 * @create: 2018-07-20 16:41
 */
@Mapper
@Repository
public interface BookDAO {

    int addBook(Book book);

    Book getBookById(@Param("id") Long id);

    List<Book> getBooks();
}
