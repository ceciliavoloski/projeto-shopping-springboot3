package com.ceciliavoloski.shopping.controller;

import com.ceciliavoloski.shopping.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> fildAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "123456");
        return ResponseEntity.ok().body(u);
    }
}
