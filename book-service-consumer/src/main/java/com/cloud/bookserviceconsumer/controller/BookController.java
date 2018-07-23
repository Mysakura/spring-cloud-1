package com.cloud.bookserviceconsumer.controller;

import com.cloud.common.entity.Book;
import com.cloud.common.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud-master
 * @description:
 * @author: 001977
 * @create: 2018-07-20 17:02
 */
@RestController
@RequestMapping("/consume/book")
public class BookController {

    private static final String URL = "http://localhost:8080";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public BaseResponse<Integer> addBook(@RequestBody Book book){
        Integer integer = restTemplate.postForObject(URL + "/book/add", book, Integer.class);
        BaseResponse<Integer> response = new BaseResponse<>(0,"Success");
        response.setData(integer);
        return response;
    }

    @RequestMapping("/get/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") Long id){
        return restTemplate.getForEntity(URL + "/book/get/" + id,Book.class);
    }

    @RequestMapping("/getAll")
    public String getBooks(){
        String s = restTemplate.getForObject(URL + "/book/getAll", String.class);
        return s;
    }
}
