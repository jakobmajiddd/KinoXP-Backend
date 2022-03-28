package com.company.kinoxpbackend.services;

import com.company.kinoxpbackend.exceptions.LoginException;
import com.company.kinoxpbackend.models.User;
import com.company.kinoxpbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User verifyLogin(User user) throws LoginException {
        return userRepository.findByUsernamePasswordMatch(user.getUsername(), user.getPassword())
                .orElseThrow(() -> new LoginException("Incorrect details"));
    }
}
