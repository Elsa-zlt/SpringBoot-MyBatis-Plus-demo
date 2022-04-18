package com.example.demo.controller;

import com.example.demo.controller.utils.R;
import com.example.demo.dao.CategoryDao;
import com.example.demo.dao.ProductDao;
import com.example.demo.domain.category_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private CategoryDao  categoryDao;

    @GetMapping("/hello")
    public R hello(){
        R r = new R(productDao.selectList(null));
        return r;
    }

    @RequestMapping("/hhh")
    public R hhh(){
        return new R(productDao.selectById(1));
    }

    @RequestMapping("/hh")
    public R hh(){
        return new R(categoryDao.selectList(null));
    }

    @GetMapping("/t")
    public R t(){
        return new R(false);
    }

    // 删除操作
    @DeleteMapping("/d/{id}")
    public R t(@PathVariable int id){
        return new R(categoryDao.deleteById(id));
    }

    // 添加操作
    @PostMapping("/p")
    public R add(){
        return new R(categoryDao.insert(new category_(10,"121212")));
    }

    @PutMapping("/u/{id}")
    public R update(@PathVariable int id){
        return new R(categoryDao.updateById(new category_(id,"erewre")));
    }

}
