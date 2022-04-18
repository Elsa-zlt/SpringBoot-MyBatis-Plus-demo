package com.example.demo.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R {

    private boolean flag;
    private Object data;

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Object object){
        this.flag = true;
        this.data = object;
    }

}
