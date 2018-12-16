package com.imooc.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.dto.User;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 钟宇雷 on 2018/10/22.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    @JsonView(User.UserSimpleView.class)
    public List<User> query(Pageable pageable) {

        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getSort());

        List<User> userList = new ArrayList<>();
        userList.add(new User("tom1"));
        userList.add(new User("tom2"));
        userList.add(new User("tom3", "123"));

        return userList;
    }

    @GetMapping("/{id:\\d+}")
    @JsonView(User.UserDetailView.class)
    public User getInfo(@PathVariable String id) {
        User user = new User("tom", null);
        user.setUsername("tom");

        System.out.println(user.getUsername());

        return user;
    }

    @PostMapping
    public User create(@Valid @RequestBody User user, BindingResult errors) {

        if (errors.hasErrors()) {
            errors.getAllErrors().stream().forEach(error -> System.out.println(error.getDefaultMessage()));
        }

        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getBirthday());

        user.setId("1");
        return user;
    }

    @PostMapping("/test")
    public void test(String json) {
        List<User> userList = (List<User>) JSONObject.parseObject(json).get("Applist");
        for (User user : userList) {
            System.out.println(user.getUsername());
        }

    }

}
