package com.translationfeedback.controllers;

import com.translationfeedback.models.User;
import com.translationfeedback.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import org.modelmapper.ModelMapper;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

  //  private ModelMapper modelMapper;
    private UserService userService;

    @Autowired
    public UserController(UserService userService/*, ModelMapper modelMapper*/){
        this.userService=userService;
     //   this.modelMapper=modelMapper;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id){
        return this.userService.getUserById(id);
    }

    @PostMapping("/users/auth")
    public User authenticateUser(@RequestBody User user){
        return this.userService.authenticateUser(user);
    }

    @PostMapping("/users")
    public User addNewUser(@RequestBody User user){
        return this.userService.createUser(user);
    }
}
