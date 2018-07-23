package com.cloud.common.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @program: cloud-master
 * @description:
 * @author: 001977
 * @create: 2018-07-20 17:05
 */
@Getter
@Setter
public class BaseResponse<T> implements Serializable {
    private int code;
    private String desc;
    private T data;

    public BaseResponse(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
