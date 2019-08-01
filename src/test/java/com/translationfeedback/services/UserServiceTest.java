package com.translationfeedback.services;

import com.translationfeedback.models.User;
import com.translationfeedback.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void getAllUsers() {
        when(userService.getAllUsers()).thenReturn(subData());
        userService.getAllUsers();
        verify(userRepository, times(1)).findAll();
    }

    @Test
    public void createUser() {
    }

    @Test
    public void authenticateUser() {
    }


    private List<User> subData() {return Arrays.asList(new User(), new User());}

    private User createUserMock(){return new User ();}
}