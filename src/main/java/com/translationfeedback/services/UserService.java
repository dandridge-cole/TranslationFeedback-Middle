package com.translationfeedback.services;

import com.translationfeedback.models.User;
import com.translationfeedback.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    private UserService(UserRepository userRepository){this.userRepository=userRepository;}

    public List<User> getAllUsers(){return this.userRepository.findAll();}

    public User createUser(User newUser){
        return this.userRepository.save(newUser);
    }

    public User authenticateUser(User user){
        return this.userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }
}
