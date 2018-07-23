package com.cloud.common.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: cloud-master
 * @description:
 * @author: 001977
 * @create: 2018-07-20 16:39
 */
@Getter
@Setter
public class Book implements Serializable {

    private Long id;
    private String bookName;    // 书名
    private String bookSize;    // 开本
    private String pack;         // 包装
    private String ISBN;         // isbn
    private String publisher;   // 出版社
    private Date publishTime;   // 出版时间

}
