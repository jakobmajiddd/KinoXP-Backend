package com.company.kinoxpbackend.controllers;

import com.company.kinoxpbackend.exceptions.LoginException;
import com.company.kinoxpbackend.models.User;
import com.company.kinoxpbackend.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    private final UserService userService;

    @Autowired
    public UserServiceTest(UserService userService) {
        this.userService = userService;
    }

    @Test
    void verifyLogin() throws LoginException {
        User testUser = new User();
        testUser.setUsername("jeh");
        testUser.setPassword("hej");

        assertNotNull(userService.verifyLogin(testUser));

    }
}