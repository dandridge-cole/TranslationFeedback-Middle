package com.translationfeedback.services;

import com.translationfeedback.models.Language;
import com.translationfeedback.models.User;
import com.translationfeedback.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;
    private LanguageService languageService;

    @Autowired
    private UserService(UserRepository userRepository, LanguageService languageService){
        this.userRepository=userRepository;
        this.languageService=languageService;
    }

    public List<User> getAllUsers(){return this.userRepository.findAll();}

    public User createUser(User newUser){
        return this.userRepository.save(newUser);
    }

    public User authenticateUser(User user){
        return this.userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    public User getUserById(Long id){
        return this.userRepository.getById(id);
    }

//    public List<User> getUsersByLang(String lang){
//        Language language=this.languageService.getLanguageByName(lang);
//        return this.userRepository.getByLang(language);
//    }
}
