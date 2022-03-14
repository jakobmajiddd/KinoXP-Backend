package com.company.kinoxpbackend.controllers;

import com.company.kinoxpbackend.models.User;
import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/test")
    public ResponseEntity<User> test(@RequestBody User user) {
        System.out.println(user.getUsername());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
