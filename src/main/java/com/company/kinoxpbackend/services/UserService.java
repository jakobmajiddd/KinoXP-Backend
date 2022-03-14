package com.company.kinoxpbackend.services;

import com.company.kinoxpbackend.models.User;
import com.company.kinoxpbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    public UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User verifyLogin(User user) {
        Optional<User> userOptional = userRepository.findByUsernamePasswordMatch(user.getUsername(), user.getPassword());
        User userLoggedIn = null;
        
        try {
            if (userOptional.isPresent()) {
                userLoggedIn = userOptional.get();
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return userLoggedIn;
    }
}
