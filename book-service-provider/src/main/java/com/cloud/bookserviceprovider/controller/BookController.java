package com.cloud.bookserviceprovider.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloud.bookserviceprovider.service.BookService;
import com.cloud.common.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: cloud-master
 * @description:
 * @author: 001977
 * @create: 2018-07-20 17:02
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        services.forEach(e -> System.err.println(e));
        List<ServiceInstance> list = discoveryClient.getInstances("BOOKSERVICEPROVIDER");
        list.forEach(e -> {
            System.out.println(e.getServiceId() + "," + e.getHost() + "," + e.getPort() + "," + e.getUri());
        });
        return this.discoveryClient;
    }

    @RequestMapping("/add")
    public int addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @RequestMapping("/get/{id}")
    public Book getBookById(@PathVariable("id") Long id){
        return bookService.getBookById(id);
    }

    @RequestMapping("/getAll")
    public String getBooks(){
        return JSONObject.toJSONString(bookService.getBooks());
    }
}
