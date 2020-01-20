package com.junsheng.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.junsheng.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
/**
 * @Description 测试-增删改查
 * @author shenglei
 * @date 2020/1/20 13:50
 */
@RestController
@RequestMapping(value = "/user",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController {
    @JsonView(User.UserListView.class)
    @GetMapping
    public List<User> get (User username){
        List<User> users = new ArrayList<>();
        User user1 = new User("sl","123456","男");
        User user2 = new User("sl","123456","男");
        User user3 = new User("sl","123456","男");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }
    @GetMapping("/{userId:\\d{1,10}}")
    @JsonView(User.UserDetailView.class)
    public User getUser (@PathVariable("userId") String id){
        User user1 = new User("sl","123456","男");
        return user1;
    }
    /*@PostMapping
    public User create(@RequestBody User user){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getSex());

        return user;
    }*/

}
