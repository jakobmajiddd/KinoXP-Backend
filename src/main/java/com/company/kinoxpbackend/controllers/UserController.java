package com.company.kinoxpbackend.controllers;

import com.company.kinoxpbackend.exceptions.LoginException;
import com.company.kinoxpbackend.models.User;
import com.company.kinoxpbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin
    @PostMapping("/verify")
    public ResponseEntity<User> verifyLogin(@RequestBody User user) throws LoginException {
        User userVerified = userService.verifyLogin(user);
        return new ResponseEntity<>(userVerified, HttpStatus.OK);
    }
}
